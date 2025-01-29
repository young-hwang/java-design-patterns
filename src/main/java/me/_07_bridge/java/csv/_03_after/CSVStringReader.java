package me._07_bridge.java.csv._03_after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class CSVStringReader extends CSVReader {
    public CSVStringReader(String string) throws IOException {
        super(new BufferedReader(new StringReader(string)));
    }
}
