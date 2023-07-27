package io.github.younghwang.hfdesignpattern.simuduck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
