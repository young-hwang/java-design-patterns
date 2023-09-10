package me._14_command.gof._02_after;

public class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
