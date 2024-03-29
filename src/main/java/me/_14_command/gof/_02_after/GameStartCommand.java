package me._14_command.gof._02_after;

public class GameStartCommand implements Command {
    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}
