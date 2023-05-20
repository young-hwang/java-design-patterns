package io.younghwang.basemodel._15_interpreter._04_java;

import java.util.regex.Pattern;

public class InterpreterInJava {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".pr...", "spring"));
        System.out.println(Pattern.matches("[a-z]{6}", "spring"));
        System.out.println(Pattern.matches("you[a-z]{2}[0-9]{4}", "young1984"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "a"));
    }
}
