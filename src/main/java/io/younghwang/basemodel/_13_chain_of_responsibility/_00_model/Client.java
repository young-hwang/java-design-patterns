package io.younghwang.basemodel._13_chain_of_responsibility._00_model;

public class Client {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandler();
        handler.handleRequest(new Request());
    }
}
