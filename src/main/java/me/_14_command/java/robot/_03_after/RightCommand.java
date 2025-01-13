package me._14_command.java.robot._03_after;

public class RightCommand extends Command {
    public RightCommand(String right) {
        super(right);
    }

    @Override
    public void execute(Robot robot) {
        robot.right();
    }

}
