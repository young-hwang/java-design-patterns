package io.younghwang.basemodel._14_command._03_after;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Button button = new Button();

        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
