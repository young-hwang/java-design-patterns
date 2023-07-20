package io.github.younghwang.hfdesignpattern.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light lightOfKitchen = new Light("Kitchen");
        Light lightOfLivingRoom = new Light("Living Room");
        GarbageDoor garbageDoor = new GarbageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand kitchenLightOn = new LightOnCommand(lightOfKitchen);
        LightOffCommand kitchenLightOff = new LightOffCommand(lightOfKitchen);

        LightOnCommand livingRoomLightOn = new LightOnCommand(lightOfLivingRoom);
        LightOffCommand livingRoomLightOff = new LightOffCommand(lightOfLivingRoom);

        GarbageDoorUpCommand garbageDoorUpCommand = new GarbageDoorUpCommand(garbageDoor);
        GarbageDoorDownCommand garbageDoorDownCommand = new GarbageDoorDownCommand(garbageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(2, garbageDoorUpCommand, garbageDoorDownCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);

        remoteControl.offButtonWasPushed(3);
        remoteControl.offButtonWasPushed(2);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
    }
}
