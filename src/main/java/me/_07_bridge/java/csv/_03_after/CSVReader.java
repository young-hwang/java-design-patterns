package me._07_bridge.java.csv._03_after;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class CSVReader {
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
    protected final BufferedReader bufferedReader;

    protected CSVReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String[] readCSV() throws IOException {
        String line = bufferedReader.readLine();
        if(line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    public void close() throws IOException {
        bufferedReader.close();
    }
}
