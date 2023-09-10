package me._12_proxy._02_after;

public class GameService {
    public void startGame() {
        System.out.println("게임을 시작합니다.");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
