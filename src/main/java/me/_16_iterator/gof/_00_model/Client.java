package me._16_iterator.gof._00_model;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.createIterator();
        iterator.hasNext();
        iterator.getNext();
    }
}
