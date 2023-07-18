package io.github.younghwang.hfdesignpattern.simuduck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
