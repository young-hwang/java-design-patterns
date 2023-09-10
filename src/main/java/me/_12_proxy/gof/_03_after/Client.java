package me._12_proxy.gof._03_after;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new GameServiceReal());
        gameService.startGame();
    }
}
