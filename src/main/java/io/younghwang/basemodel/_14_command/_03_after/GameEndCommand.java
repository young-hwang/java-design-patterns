package io.younghwang.basemodel._14_command._03_after;

public class GameEndCommand implements Command {
    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(new Game()).execute();
    }
}
