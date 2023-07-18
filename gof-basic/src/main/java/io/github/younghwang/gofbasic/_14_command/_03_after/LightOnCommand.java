package io.github.younghwang.gofbasic._14_command._03_after;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
