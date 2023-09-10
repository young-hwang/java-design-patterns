package me._12_proxy._03_after;

public class GameServiceProxy implements GameService {
    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new GameServiceReal();
        }
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
