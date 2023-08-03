package io.github.younghwang.hfdesignpattern.homesweethometheater;

public class Projector {
    DvdPlayer dvdPlayer;

    void on() {
        System.out.println("Top-O-Line Projector on");
    }

    void off() {
        System.out.println("Top-O-Line Projector off");
    }

    void tvModel() {

    }

    void wideScreenModel() {
        System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }

    @Override
    public String toString() {
        return "Projector{" +
                "dvdPlayer=" + dvdPlayer +
                '}';
    }
}
