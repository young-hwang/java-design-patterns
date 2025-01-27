package me.etc.delegate.java.address._03_after;

import java.io.IOException;
import java.util.Enumeration;

public class AddressFile {
    private final Database database;

    public AddressFile(String filename) {
        this.database = new Database(filename);
    }

    public Enumeration names() {
        return database.keys();
    }

    public void set(String key, String value) {
        database.set(key, value);
    }

    public String get(String key) {
        return database.get(key);
    }

    public void update() throws IOException {
        database.update();
    }
}
