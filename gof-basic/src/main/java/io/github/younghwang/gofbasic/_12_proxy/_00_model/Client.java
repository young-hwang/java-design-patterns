package io.github.younghwang.gofbasic._12_proxy._00_model;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.operation();
    }
}