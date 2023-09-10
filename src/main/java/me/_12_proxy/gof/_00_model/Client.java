package me._12_proxy.gof._00_model;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.operation();
    }
}
