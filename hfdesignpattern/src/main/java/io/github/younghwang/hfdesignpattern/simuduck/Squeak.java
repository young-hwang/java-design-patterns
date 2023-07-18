package io.github.younghwang.hfdesignpattern.simuduck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Speak");
    }
}
