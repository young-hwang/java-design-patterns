package io.github.younghwang.hfdesignpattern.command;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
