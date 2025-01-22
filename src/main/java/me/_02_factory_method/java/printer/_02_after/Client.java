package me._02_factory_method.java.printer._02_after;

public class Client {
    private final Printer printer;

    public Client(boolean graphical) {
        this.printer = Printer.create(graphical);
    }

    public void execute() {
        int[] table = {3, 1 ,4, 1, 5, 9};
        for(int n : table) {
            printer.print(n);
        }
    }
}
