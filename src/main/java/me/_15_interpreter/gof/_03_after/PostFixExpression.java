package me._15_interpreter.gof._03_after;

import java.util.Map;

public interface PostFixExpression {
    int interpret(Map<Character, Integer> context);

    static PostFixExpression plus(PostFixExpression left, PostFixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static PostFixExpression minus(PostFixExpression left, PostFixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static PostFixExpression variable(Character c) {
        return context -> context.get(c);
    }
}
