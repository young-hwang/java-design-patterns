package me._14_command.java.robot._03_after;

public class ForwardCommand extends Command {
    public ForwardCommand(String forward) {
        super(forward);
    }

    @Override
    public void execute(Robot robot) {
        robot.forward();
    }
}
