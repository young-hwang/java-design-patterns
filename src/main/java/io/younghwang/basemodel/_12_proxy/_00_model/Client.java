package io.younghwang.basemodel._12_proxy._00_model;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.operation();
    }
}
