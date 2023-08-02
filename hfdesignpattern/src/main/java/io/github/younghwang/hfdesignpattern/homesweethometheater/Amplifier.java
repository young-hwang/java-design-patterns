package io.github.younghwang.hfdesignpattern.homesweethometheater;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private int volume;

    public void on() {

    }

    public void off() {

    }

    public void setCd() {

    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setStereoSound() {

    }

    public void setSurroundSound() {

    }

    public void setTimer() {

    }

    public void setVolume(int volume) {
        this.volume = volume;
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
