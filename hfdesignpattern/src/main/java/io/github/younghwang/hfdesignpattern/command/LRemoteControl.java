package io.github.younghwang.hfdesignpattern.command;

import java.util.Arrays;

public class LRemoteControl {
    private LCommand[] onCommands;
    private LCommand[] offCommands;

    public LRemoteControl() {
        this.onCommands = new LCommand[7];
        this.offCommands = new LCommand[7];

        LCommand noCommand = new LNoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = () -> {
            };
            this.offCommands[i] = () -> {
            };
        }
    }

    public void setCommand(int slot, LCommand onCommand, LCommand offCommand) {
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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RemoteControl{");
        Arrays.stream(onCommands).forEach(c -> stringBuffer.append(c.getClass().toString() + "\n"));
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
