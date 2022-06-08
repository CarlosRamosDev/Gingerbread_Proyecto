package com.gingerbread.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        return getTime() + " [" + component + "] " + message;
    }

    public static String getTime() {
        return "[" + java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")) + "]";
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
            BufferedReader reader = new BufferedReader(new java.io.FileReader(path + "/latest.log"));
            BufferedWriter logDate = new BufferedWriter(new java.io.FileWriter(path + "/" + java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ".log"));
            reader.transferTo(logDate);
            logDate.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
