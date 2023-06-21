package io.younghwang.basemodel._03_abstract_factory._00_model;

public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public AbstractFactory getFactory() {
        return factory;
    }

    public static void main(String[] args) {
        Client client = new Client(new ConcreteFactory());
        AbstractFactory factory = client.getFactory();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        System.out.println(productA);
        System.out.println(productB);
    }
}
