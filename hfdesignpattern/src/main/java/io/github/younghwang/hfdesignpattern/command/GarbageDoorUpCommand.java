package io.github.younghwang.hfdesignpattern.command;

public class GarbageDoorUpCommand implements Command {

    private GarbageDoor garbageDoor;

    public GarbageDoorUpCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
        System.out.println("Garbage Door Up");
    }

}
