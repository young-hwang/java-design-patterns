package me._07_bridge.java.csv._02_after;

import java.io.IOException;

public class CSVFileTreePrinter extends CSVPrinter {
    public CSVFileTreePrinter(String fileName) throws IOException {
        super(new CSVFileReader(fileName));
    }

    @Override
    public void print() throws IOException {
        String[] prevItem = new String[0];

        for (int row = 0; true; row++) {
            String[] item = readCSV();
            if(item == null) {
                break;
            }
            boolean justPrint = false;
            for (int column = 0; column < item.length; column++) {
                if(justPrint) {
                    printLine(column, item[column]);
                } else {
                    if (prevItem.length <= column || !item[column].equals(prevItem[column])) {
                        printLine(column, item[column]);
                        justPrint = true;
                    }
                }
            }
            prevItem = item;
        }
    }

    private void printLine(int indent, String s) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println(s);
    }

    @Override
    public String[] readCSV() throws IOException {
        return reader.readCSV();
    }
}
