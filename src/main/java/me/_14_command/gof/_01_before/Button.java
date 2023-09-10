package me._14_command.gof._01_before;

public class Button {
    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.on();
    }
}
