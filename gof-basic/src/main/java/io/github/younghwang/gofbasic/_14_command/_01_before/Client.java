package io.github.younghwang.gofbasic._14_command._01_before;

public class Client {
    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
