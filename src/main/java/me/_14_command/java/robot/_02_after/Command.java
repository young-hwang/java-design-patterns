package me._14_command.java.robot._02_after;

import java.util.HashMap;
import java.util.Map;

public class Command {
    public static final Command FORWARD = new Command("forward");
    public static final Command BACKWARD = new Command("backward");
    public static final Command TURN_RIGHT = new Command("right");
    public static final Command TURN_LEFT = new Command("left");

    private final String name;
    private static final Map<String, Command> commands = new HashMap<>();

    public Command(String name) {
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

    public static Command parseCommand(String commandString) throws InvalidCommandException{
        if (commands.containsKey(commandString)) {
            return commands.get(commandString);
        }
        throw new InvalidCommandException();
    }
}
