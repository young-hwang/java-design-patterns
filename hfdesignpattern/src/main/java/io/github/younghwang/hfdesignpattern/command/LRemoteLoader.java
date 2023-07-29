package io.github.younghwang.hfdesignpattern.command;

public class LRemoteLoader {
    public static void main(String[] args) {
        LRemoteControl remoteControl = new LRemoteControl();
        Light livingRoom = new Light("Living Room");
        remoteControl.setCommand(0, livingRoom::on, livingRoom::off);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        Stereo stereo = new Stereo("Living Room");
        remoteControl.setCommand(1, () -> {
            stereo.on();
            stereo.setCd();
            stereo.setVolume(11);
        }, stereo::off);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
