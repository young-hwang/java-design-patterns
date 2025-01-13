package me._14_command.java.robot._03_after;

public class BackwardCommand extends Command {
    public BackwardCommand(String backward) {
        super(backward);
    }

    @Override
    public void execute(Robot robot) {
        robot.backward();
    }
}
