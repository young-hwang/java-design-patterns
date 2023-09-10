package me._14_command.hf;

public class GarbageDoorDownCommand implements Command {

    private final GarbageDoor garbageDoor;

    public GarbageDoorDownCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
        garbageDoor.down();
    }

    @Override
    public void undo() {
        garbageDoor.up();
    }

}
