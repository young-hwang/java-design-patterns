package io.github.younghwang.hfdesignpattern.compound;

// Decorator Pattern
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        this.duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
