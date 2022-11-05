package io.younghwang.javadesignpattern.basemodel._01_singleton._03_after;

public class App {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1 == settings2);
    }
}
