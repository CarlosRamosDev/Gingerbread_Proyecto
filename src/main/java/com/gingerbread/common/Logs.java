package com.gingerbread.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logs {
    private static final Path path = Paths.get(System.getProperty("user.dir") + "/data/logs/");
    private final BufferedWriter logBuffer;

    public Logs() {
        try {
            if (!Files.exists(path)) {
                Files.createDirectories(path);
            }
            logBuffer = new BufferedWriter(new java.io.FileWriter(path + "/latest.log"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNewLog(String component, String message) {
        return "[" + getTime() + "] [" + component + "] " + message;
    }

    public static String getTime() {
        return java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")) ;
    }

    public void newLog(String component, String message) {
        String log = getNewLog(component, message);
        try {
            logBuffer.write(log);
            logBuffer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {

        try {
            logBuffer.close();
            LocalDate date = LocalDate.now();
            BufferedReader reader;
            BufferedReader reader2;
            StringBuffer Temp = new StringBuffer();

            Path newPath = Paths.get(path + "/" + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ".log");
            reader = new BufferedReader(new java.io.FileReader(path + "/latest.log"));
            if (Files.exists(newPath)) {
                reader2 = new BufferedReader(new java.io.FileReader(newPath.toFile()));
                reader2.lines().forEach(line -> {
                    Temp.append(line);
                    Temp.append("\n");
                });
            }
            BufferedWriter logDate = new BufferedWriter(new java.io.FileWriter(String.valueOf(newPath)));
            logDate.write(Temp.toString());
            reader.lines().forEach(line -> {
                try {
                    logDate.write(line);
                    logDate.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            logDate.close();
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
