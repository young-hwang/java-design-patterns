package io.younghwang.javadesignpattern.simuduck;

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
