package me._14_command.hf;

public class GarbageDoorLightOffCommand implements Command {

    private final GarbageDoor garbageDoor;

    public GarbageDoorLightOffCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }

}
