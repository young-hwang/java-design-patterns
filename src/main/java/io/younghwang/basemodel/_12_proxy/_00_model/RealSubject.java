package io.younghwang.basemodel._12_proxy._00_model;

public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("Real Subject");
    }
}