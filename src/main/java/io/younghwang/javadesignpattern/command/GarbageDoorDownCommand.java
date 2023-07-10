package io.younghwang.javadesignpattern.command;

public class GarbageDoorDownCommand implements Command {

    private final GarbageDoor garbageDoor;

    public GarbageDoorDownCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
        garbageDoor.down();
    }

}
