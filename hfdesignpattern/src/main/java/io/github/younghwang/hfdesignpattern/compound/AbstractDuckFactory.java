package io.github.younghwang.hfdesignpattern.compound;

// Abstract Factory Pattern
public abstract class AbstractDuckFactory {
    abstract Quackable createMallardDuck();

    abstract Quackable createRedHeadDuck();

    abstract Quackable createDuckCall();

    abstract Quackable createRubberDuck();
}
