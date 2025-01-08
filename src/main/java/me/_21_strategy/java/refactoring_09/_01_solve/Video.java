package me._21_strategy.java.refactoring_09._01_solve;

public class Video extends Media {
    @Override
    public void play() {
        System.out.println("Video: play");
    }

    @Override
    public void loop() {
        System.out.println("Video: loop");
    }

    @Override
    public void stop() {
        System.out.println("Video: stop");
    }
}
