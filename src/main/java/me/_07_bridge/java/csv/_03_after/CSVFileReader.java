package me._07_bridge.java.csv._03_after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVFileReader extends CSVReader {
    public CSVFileReader(String fileName) throws IOException {
        super(Files.newBufferedReader(Path.of(fileName)));
    }
}
