package me._10_facade.hf;

public class TheaterLights {
    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }

    public void off() {
        System.out.println("Theater Ceiling Lights off");
    }

    public void dim(int dimming) {
        System.out.println("Theater Ceiling Lights dimming to " + dimming + "%");
    }
}
