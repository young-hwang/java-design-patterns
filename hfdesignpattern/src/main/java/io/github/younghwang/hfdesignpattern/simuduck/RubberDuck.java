package io.github.younghwang.hfdesignpattern.simuduck;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Sound is Rubber io.younghwang.javadesignpattern.simuduck.Duck");
    }

    @Override
    public void display() {
        System.out.println("Look like Rubber io.younghwang.javadesignpattern.simuduck.Duck");
    }
}
