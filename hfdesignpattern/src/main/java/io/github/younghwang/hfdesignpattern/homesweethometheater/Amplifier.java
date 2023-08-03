package io.github.younghwang.hfdesignpattern.homesweethometheater;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setCd() {

    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setStereoSound() {

    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setTimer() {

    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }

    @Override
    public String toString() {
        return "Amplifier{" +
                "tuner=" + tuner +
                ", dvdPlayer=" + dvdPlayer +
                ", cdPlayer=" + cdPlayer +
                '}';
    }
}
