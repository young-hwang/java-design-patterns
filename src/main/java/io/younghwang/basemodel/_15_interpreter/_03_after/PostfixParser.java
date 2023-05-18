package io.younghwang.basemodel._15_interpreter._03_after;

import java.util.Stack;

import static io.younghwang.basemodel._15_interpreter._03_after.PostFixExpression.*;

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
                return plus(stack.pop(), stack.pop());
            case '-':
                PostFixExpression right = stack.pop();
                PostFixExpression left = stack.pop();
                return minus(left, right);
            default:
                return variable(c);
        }
    }
}
