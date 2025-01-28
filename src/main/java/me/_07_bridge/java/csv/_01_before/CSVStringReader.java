package me._07_bridge.java.csv._01_before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVStringReader extends CSVReader {
    private final BufferedReader bufferedReader;

    public CSVStringReader(String string) throws IOException {
        this.bufferedReader = new BufferedReader(new StringReader(string));
    }

    @Override
    String[] readCSV() throws IOException {
        String line = bufferedReader.readLine();
        if(line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    @Override
    void close() throws IOException {
        bufferedReader.close();
    }
}
