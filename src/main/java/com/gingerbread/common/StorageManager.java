package com.gingerbread.common;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class StorageManager {

    public static Object getObjectFile(Path path) throws Exception {
        InputStream file = Files.newInputStream(path);
        ObjectInputStream objectFile = new ObjectInputStream(file);
        return objectFile.readObject();
    }

    public static void setObjectFile(Path path, Object object) throws Exception {
        OutputStream file = Files.newOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
