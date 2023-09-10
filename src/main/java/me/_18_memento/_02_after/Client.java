package me._18_memento._02_after;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameSave save = game.save();

        Game restoreGame = new Game();
        restoreGame.restore(save);
        System.out.println(restoreGame.getRedTeamScore());
        System.out.println(restoreGame.getBlueTeamScore());
    }
}
