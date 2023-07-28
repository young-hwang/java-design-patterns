package io.github.younghwang.hfdesignpattern.command;

public class LRemoteLoader {
    public static void main(String[] args) {
        LRemoteControl remoteControl = new LRemoteControl();
        Light livingRoom = new Light("Living Room");
        remoteControl.setCommand(0, () -> {
            livingRoom.on();
        }, () -> {
            livingRoom.off();
        });
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}
