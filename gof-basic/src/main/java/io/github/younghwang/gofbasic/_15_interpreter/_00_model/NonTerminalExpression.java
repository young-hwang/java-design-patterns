package io.github.younghwang.gofbasic._15_interpreter._00_model;

import java.util.List;

public class NonTerminalExpression implements Expression {
    // NonTerminalExpression은 다른 Expression 재귀적으로 처리
    List<Expression> expressions;

    @Override
    public void interpret(Context context) {

    }
}
