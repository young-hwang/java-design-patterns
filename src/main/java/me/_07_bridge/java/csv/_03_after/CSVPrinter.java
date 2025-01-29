package me._07_bridge.java.csv._03_after;

import java.io.IOException;

public abstract class CSVPrinter {
    protected final CSVReader reader;

    public CSVPrinter(CSVReader reader) {
        this.reader = reader;
    }

    public abstract String[] readCSV() throws IOException;

    public abstract void print() throws IOException;
}
