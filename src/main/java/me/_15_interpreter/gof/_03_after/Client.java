package me._15_interpreter.gof._03_after;

import me._15_interpreter.gof._02_after.PostFixExpression;
import me._15_interpreter.gof._02_after.PostfixParser;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        PostFixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}
