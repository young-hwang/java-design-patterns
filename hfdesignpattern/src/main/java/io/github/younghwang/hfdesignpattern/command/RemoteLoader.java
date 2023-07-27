package io.github.younghwang.hfdesignpattern.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        Tv tv = new Tv("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();


        LightOnCommand lightOn = new LightOnCommand(light);
        TvOnCommand tvOn = new TvOnCommand(tv);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        TvOffCommand tvOff = new TvOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, tvOn, stereoOn, hottubOn};
        Command[] partyOff = {lightOff, tvOff, stereoOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("Pushing Macro On ---------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("Pushing Macro Off --------");
        remoteControl.offButtonWasPushed(0);
    }
}
