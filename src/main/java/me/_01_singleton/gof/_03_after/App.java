package me._01_singleton.gof._03_after;

public class App {
    public static void main(String[] args) {
        System.out.println("start main");
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1 == settings2);
    }
}
