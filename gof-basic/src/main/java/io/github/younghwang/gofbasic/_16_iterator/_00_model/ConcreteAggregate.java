package io.github.younghwang.gofbasic._16_iterator._00_model;

public class ConcreteAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }
}