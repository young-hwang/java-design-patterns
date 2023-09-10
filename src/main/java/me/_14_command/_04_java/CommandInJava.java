package me._14_command._04_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {
    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(light::on);
        executorService.submit(light::off);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.shutdown();
    }
}
