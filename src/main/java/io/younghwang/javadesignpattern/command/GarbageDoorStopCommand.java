package io.younghwang.javadesignpattern.command;

public class GarbageDoorStopCommand implements Command {

    private GarbageDoor garbageDoor;

    public GarbageDoorStopCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
        System.out.println("Garbage Door Stop");
    }

}
