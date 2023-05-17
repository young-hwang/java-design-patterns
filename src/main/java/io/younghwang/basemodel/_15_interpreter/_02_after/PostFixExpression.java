package io.younghwang.basemodel._15_interpreter._02_after;

import java.util.Map;

public interface PostFixExpression {
    int interpret(Map<Character, Integer> context);
}
