package me._07_bridge.java.csv._02_after;

import java.io.IOException;

public class CSVStringTablePrinter extends CSVPrinter {
    public CSVStringTablePrinter(String string) throws IOException {
        super(new CSVStringReader(string));
    }

    @Override
    public String[] readCSV() throws IOException {
        return reader.readCSV();
    }

    @Override
    public void print() throws IOException {
        System.out.println("<table>");
        for (int row = 0; true; row++) {
            String[] items = readCSV();
            if (items == null) {
                break;
            }
            System.out.print("<tr>");
            for (int col = 0; col < items.length; col++) {
                System.out.print("<td>" + items[col] + "</td>");
            }
            System.out.print("</tr>");
            System.out.println();
        }
        System.out.println("</table>");
    }
}
