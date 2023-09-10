package me._14_command.hf;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light on in " + location);
    }

    public void off() {
        System.out.println("Light off in " + location);
    }

}
