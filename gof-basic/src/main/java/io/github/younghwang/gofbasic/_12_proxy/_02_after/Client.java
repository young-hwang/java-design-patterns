package io.github.younghwang.gofbasic._12_proxy._02_after;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
