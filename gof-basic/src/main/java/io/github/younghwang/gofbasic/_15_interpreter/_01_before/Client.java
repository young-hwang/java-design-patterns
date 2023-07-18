package io.github.younghwang.gofbasic._15_interpreter._01_before;

public class Client {
    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }
}
