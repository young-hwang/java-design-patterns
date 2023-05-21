package io.younghwang.basemodel._14_command._02_after;

public class GameEndCommand implements Command {
    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.end();
    }
}
