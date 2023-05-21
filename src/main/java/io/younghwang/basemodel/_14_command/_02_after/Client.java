package io.younghwang.basemodel._14_command._02_after;

public class Client {
    public static void main(String[] args) {
        Button button = new Button(() -> System.out.println("불을 켰습니다."));
        button.press();

        Button button1 = new Button(new LightOnCommand(new Light()));
        button1.press();

        Button button2 = new Button(new LightOffCommand(new Light()));
        button2.press();

        Button button3 = new Button(new GameStartCommand(new Game()));
        button3.press();

        Button button4 = new Button(new GameEndCommand(new Game()));
        button4.press();
    }
}
