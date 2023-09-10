package me._06_adapter.gof._00_model;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.operation(new Adapter());
    }

    public void operation(Target target) {
        target.operation();
    }
}
