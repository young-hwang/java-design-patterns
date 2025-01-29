package me._07_bridge.java.csv._02_after;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVFileReader extends CSVReader {
    private final BufferedReader bufferedReader;

    public CSVFileReader(String fileName) throws IOException {
        this.bufferedReader = Files.newBufferedReader(Path.of(fileName));
    }

    @Override
    public String[] readCSV() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }
}
