package io.github.younghwang.hfdesignpattern.command;

public class TvOnCommand implements Command {
    Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
