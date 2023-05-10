package io.younghwang.basemodel._18_memento._01_before;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        int redTeamScore = game.getRedTeamScore();
        int blueTeamScore = game.getBlueTeamScore();

        Game restoreGame = new Game();
        restoreGame.setRedTeamScore(redTeamScore);
        restoreGame.setBlueTeamScore(blueTeamScore);
    }
}
