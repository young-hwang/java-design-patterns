package io.younghwang.basemodel._14_command._02_after;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

    }
}
