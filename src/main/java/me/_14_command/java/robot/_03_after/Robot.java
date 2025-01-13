package me._14_command.java.robot._03_after;

import java.util.StringTokenizer;

public class Robot {
    private final String name;
    private final Position position = new Position(0, 0);
    private final Direction direction = new Direction(0, 1);

    public Robot(String name) {
        this.name = name;
    }

    public void execute(String commandSequence) {
        StringTokenizer tokenizer = new StringTokenizer(commandSequence, " ");
        try {
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                executeCommand(token);
            }
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command: " + e.getMessage());
        }
    }

    private void executeCommand(String commandString) throws InvalidCommandException {
        Command command = Command.parseCommand(commandString);
        command.execute(this);
    }

    public void left() {
        direction.setDirection(-direction.y, direction.x);
    }

    public void right() {
        direction.setDirection(direction.y, -direction.x);
    }

    public void backward() {
        position.relativeMove(-direction.x, -direction.y);
    }

    public void forward() {
        position.relativeMove(direction.x, direction.y);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", direction=" + direction +
                '}';
    }
}
