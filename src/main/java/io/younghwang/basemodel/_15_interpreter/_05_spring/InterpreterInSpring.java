package io.younghwang.basemodel._15_interpreter._05_spring;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class InterpreterInSpring {
    public static void main(String[] args) {
        Book book = new Book("spring");
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("title");
        System.out.println(expression.getValue(book));
    }
}
