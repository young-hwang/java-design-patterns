package me._07_bridge.java.csv._03_after;

import java.io.IOException;

public class Main {
    private final static String SAMPLE_CSV_STRING = "좋은 아침입니다.,Good morning!.\n"
            + "안녕하세요.,Hello.\n"
            + "안녕하세요.,Good evening.\n"
            + "안녕히 주무세요.,Good night.\n";
    private final static String SAMPLE_CSV_FILE = "file.csv";

    public static void main(String[] args) throws IOException {
        new CSVTablePrinter(new CSVStringReader(SAMPLE_CSV_STRING)).print();
        new CSVTreePrinter(new CSVFileReader(SAMPLE_CSV_FILE)).print();
    }
}
