package me._02_factory_method.java.printer._01_before;

public class GraphPrinter extends Printer {
    @Override
    public void print(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.printf("(%d)", n);
        System.out.println();
    }
}
