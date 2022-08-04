package io.younghwang.javadesignpattern.simuduck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
