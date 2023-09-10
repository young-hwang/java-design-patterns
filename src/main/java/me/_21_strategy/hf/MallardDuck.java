package me._21_strategy.hf;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Look like Mallard io.younghwang.javadesignpattern.simuduck.Duck");
    }
}
