package me._14_command.java.robot._03_after;

public class LeftCommand extends Command {
    public LeftCommand(String left) {
        super(left);
    }

    @Override
    public void execute(Robot robot) {
        robot.left();
    }
}
