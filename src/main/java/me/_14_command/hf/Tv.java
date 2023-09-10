package me._14_command.hf;

public class Tv {
    private String location;

    public Tv(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Tv on in" + location);
    }

    public void off() {
        System.out.println("Tv off in" + location);
    }

}
