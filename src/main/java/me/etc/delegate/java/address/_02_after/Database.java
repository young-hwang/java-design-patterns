package me.etc.delegate.java.address._02_after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class Database {
    private final String fileName;
    private final Path path;
    private final Properties properties;

    public Database(String fileName) {
        this.fileName = fileName;
        this.properties = new Properties();
        this.path = Path.of(fileName);
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try(var file = Files.newInputStream(path)){
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void set(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key, null);
    }

    public void update() throws IOException {
        properties.store(Files.newOutputStream(this.path), "");
    }

    public Properties getProperties() {
        return properties;
    }
}
