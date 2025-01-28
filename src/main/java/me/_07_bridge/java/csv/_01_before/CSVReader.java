package me._07_bridge.java.csv._01_before;

import java.io.IOException;
import java.util.regex.Pattern;

public abstract class CSVReader {
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");

    abstract String[] readCSV() throws IOException;

    abstract void close() throws IOException;
}
