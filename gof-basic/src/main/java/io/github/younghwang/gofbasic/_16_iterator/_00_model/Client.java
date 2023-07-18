package io.github.younghwang.gofbasic._16_iterator._00_model;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.createIterator();
        iterator.hasNext();
        iterator.getNext();
    }
}
