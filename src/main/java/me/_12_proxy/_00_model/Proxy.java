package me._12_proxy._00_model;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy() {
        this.subject = new RealSubject();
    }

    @Override
    public void operation() {
        System.out.println("Start Proxy Subject");
        subject.operation();
        System.out.println("End Proxy Subject");
    }
}
