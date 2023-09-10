package me._21_strategy.hf;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Speak");
    }
}
