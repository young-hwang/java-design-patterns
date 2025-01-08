package me._21_strategy.java.refactoring_09._01_solve;

public class Music extends Media {
    @Override
    public void play() {
        System.out.println("Music: play");
    }

    @Override
    public void loop() {
        System.out.println("Music: loop");
    }

    @Override
    public void stop() {
        System.out.println("Music: stop");
    }
}
