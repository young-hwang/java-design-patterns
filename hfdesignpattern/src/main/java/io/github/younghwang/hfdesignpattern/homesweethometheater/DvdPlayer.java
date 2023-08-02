package io.github.younghwang.hfdesignpattern.homesweethometheater;

public class DvdPlayer {
    private Amplifier amplifier;
    private String movie;

    public void on() {

    }

    public void off() {

    }

    public void eject() {

    }

    public void pause() {

    }

    public void play(String movie) {
        this.movie = movie;
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

    public void stop() {

    }

    @Override
    public String toString() {
        return "DvdPlayer{" +
                "amplifier=" + amplifier +
                '}';
    }
}
