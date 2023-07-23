package io.github.younghwang.hfdesignpattern.command;

public class GarbageDoorLightOnCommand implements Command {

    private final GarbageDoor garbageDoor;

    public GarbageDoorLightOnCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
        System.out.println("Garbage Door Light On");
    }

    @Override
    public void undo() {

    }

}
