package io.younghwang.javadesignpattern.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        GarbageDoor garbageDoor = new GarbageDoor();
        GarbageDoorUpCommand garbageDoorUpCommand = new GarbageDoorUpCommand(garbageDoor);
        simpleRemoteControl.setSlot(garbageDoorUpCommand);
        simpleRemoteControl.buttonWasPressed();
    }

}
