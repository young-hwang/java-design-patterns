package io.github.younghwang.hfdesignpattern.command;

import java.util.Arrays;

public class RemoteControlTest {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControlTest() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControlTest{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }

}
