package me._12_proxy.gof._00_model;

public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("Real Subject");
    }
}
