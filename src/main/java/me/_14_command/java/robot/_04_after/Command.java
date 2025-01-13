package me._14_command.java.robot._04_after;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {
    public static final Command FORWARD = new Command("forward") {
        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    };
    public static final Command BACKWARD = new Command("backward") {
        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    };
    public static final Command TURN_RIGHT = new Command("right") {
        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    };
    public static final Command TURN_LEFT = new Command("left") {
        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    };

    private final String name;
    private static final Map<String, Command> commands = new HashMap<>();

    protected Command(String name) {
        this.name = name;
    }

    static {
        commands.put(FORWARD.name, FORWARD);
        commands.put(BACKWARD.name, BACKWARD);
        commands.put(TURN_RIGHT.name, TURN_RIGHT);
        commands.put(TURN_LEFT.name, TURN_LEFT);
    }

    public String getName() {
        return name;
    }

    public static Command parseCommand(String commandString) throws InvalidCommandException {
        if (commands.containsKey(commandString)) {
            return commands.get(commandString);
        }
        throw new InvalidCommandException();
    }

    public abstract void execute(Robot robot);
}
