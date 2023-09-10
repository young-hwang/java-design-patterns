package me._15_interpreter.gof._02_after;

import java.util.Map;

public interface PostFixExpression {
    int interpret(Map<Character, Integer> context);
}
