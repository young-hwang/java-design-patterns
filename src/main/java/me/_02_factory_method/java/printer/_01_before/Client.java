package me._02_factory_method.java.printer._01_before;

/**
 * Client가 Printer, GraphPrinter, DigitPrinter에 의존하는 문제가 있음
 */
public class Client {
    private final Printer printer;

    public Client(boolean graphical) {
        if (graphical) {
            this.printer = new GraphPrinter();
        } else {
            this.printer = new DigitPrinter();
        }
    }

    public void execute() {
        int[] table = {3, 1 ,4, 1, 5, 9};
        for(int n : table) {
            printer.print(n);
        }
    }
}
