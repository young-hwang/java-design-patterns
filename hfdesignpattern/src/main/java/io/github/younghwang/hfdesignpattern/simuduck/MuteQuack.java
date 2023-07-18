package io.github.younghwang.hfdesignpattern.simuduck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
