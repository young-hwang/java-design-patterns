package me._21_strategy.java.robot._02_after;

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

    private boolean executeCommand(String commandString) throws InvalidCommandException {
        Command command = Command.parseCommand(commandString);
        return executeCommand(command);
    }

    private boolean executeCommand(Command command) throws InvalidCommandException {
        if (command == Command.FORWARD) {
            position.relativeMove(direction.x, direction.y);
        } else if (command == Command.BACKWARD) {
            position.relativeMove(-direction.x, -direction.y);
        } else if (command == Command.TURN_RIGHT) {
            direction.setDirection(direction.y, -direction.x);
        } else if (command == Command.TURN_LEFT) {
            direction.setDirection(-direction.y, direction.x);
        } else {
            throw new InvalidCommandException();
        }
        return true;
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
