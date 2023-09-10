package me._10_facade.hf;

public class DvdPlayer {
    private Amplifier amplifier;
    private String movie;

    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void pause() {

    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Top-O-Line DVD Player playing \"" + this.movie + "\"");
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped \"" + this.movie + "\"");
    }

    @Override
    public String toString() {
        return "DvdPlayer{" +
                "amplifier=" + amplifier +
                '}';
    }
}
