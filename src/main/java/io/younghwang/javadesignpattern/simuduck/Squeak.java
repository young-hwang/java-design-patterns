package io.younghwang.javadesignpattern.simuduck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Speak");
    }
}
