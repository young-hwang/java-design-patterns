package me._02_factory_method.java.printer._01_before;

public class Main {
    public static void main(String[] args) {
        new Client(false).execute();
        new Client(true).execute();
    }
}
