package me._21_strategy.hf;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
