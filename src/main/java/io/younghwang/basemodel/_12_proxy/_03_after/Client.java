package io.younghwang.basemodel._12_proxy._03_after;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new GameServiceReal());
        gameService.startGame();
    }
}
