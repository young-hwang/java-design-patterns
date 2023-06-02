package io.younghwang.basemodel._12_proxy._05_spring;

import org.springframework.stereotype.Service;

@Service("gameService")
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
