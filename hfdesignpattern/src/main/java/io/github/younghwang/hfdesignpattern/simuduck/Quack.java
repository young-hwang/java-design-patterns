package io.github.younghwang.hfdesignpattern.simuduck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("io.younghwang.javadesignpattern.simuduck.Quack");
    }
}
