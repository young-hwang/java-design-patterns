package io.github.younghwang.hfdesignpattern.command;

public class Stereo {
    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Stereo On in " + this.location);
    }

    public void off() {
        System.out.println("Stereo Off in " + this.location);
    }

    public void setCd() {
        System.out.println("Stereo Set CD in " + this.location);
    }

    public void setDvd() {
        System.out.println("Stereo Set DVD in " + this.location);
    }

    public void setRadio() {
        System.out.println("Stereo Set Radio in " + this.location);
    }

    public void setVolume(int volume) {
        System.out.println("Stereo Set Volume in " + this.location);
    }
}
