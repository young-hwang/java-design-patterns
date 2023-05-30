package io.younghwang.basemodel._12_proxy._02_after;

public class GameServiceProxy extends GameService {
    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
