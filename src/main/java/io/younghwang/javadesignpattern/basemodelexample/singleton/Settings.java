package io.younghwang.javadesignpattern.basemodelexample.singleton;

public class Settings {
    private Settings settings;

    public static Settings getInstance() {
        return new Settings();
    }
}
