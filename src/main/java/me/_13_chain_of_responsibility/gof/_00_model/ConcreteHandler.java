package me._13_chain_of_responsibility.gof._00_model;

public class ConcreteHandler implements Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("handler1");
    }
}
