package me._12_proxy.gof._03_after;

public class GameServiceReal implements GameService {
    public void startGame() {
        System.out.println("게임을 시작합니다.");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
