package io.github.younghwang.hfdesignpattern.command;

public class GarbageDoorLightOffCommand implements Command {

    private final GarbageDoor garbageDoor;

    public GarbageDoorLightOffCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
    }

}
