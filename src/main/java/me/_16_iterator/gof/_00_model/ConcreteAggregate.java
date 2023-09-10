package me._16_iterator.gof._00_model;

public class ConcreteAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }
}
