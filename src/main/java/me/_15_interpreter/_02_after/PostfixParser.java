package me._15_interpreter._02_after;

import java.util.Stack;

public class PostfixParser {
    public static PostFixExpression parse(String s) {
        Stack<PostFixExpression> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostFixExpression getExpression(char c, Stack<PostFixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostFixExpression right = stack.pop();
                PostFixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }
}
