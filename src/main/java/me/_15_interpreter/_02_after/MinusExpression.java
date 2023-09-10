package me._15_interpreter._02_after;

import java.util.Map;

public class MinusExpression implements PostFixExpression {
    private PostFixExpression left, right;

    public MinusExpression(PostFixExpression left, PostFixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
