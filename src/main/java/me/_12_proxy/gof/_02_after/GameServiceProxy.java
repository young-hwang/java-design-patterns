package me._12_proxy.gof._02_after;

public class GameServiceProxy extends GameService {
    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
