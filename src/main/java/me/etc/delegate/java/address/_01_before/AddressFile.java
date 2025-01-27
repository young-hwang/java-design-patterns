package me.etc.delegate.java.address._01_before;

import java.util.Enumeration;

public class AddressFile {
    private final Database database;

    public AddressFile(String filename) {
        this.database = new Database(filename);
    }

    public Database getDatabase() {
        return database;
    }

    public Enumeration names() {
        return database.getProperties().propertyNames();
    }
}
