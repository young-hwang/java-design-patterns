package io.younghwang.javadesignpattern.basemodel._01_singleton._00_model;

/**
 * Singleton Pattern
 * 인스턴스를 오직 한개만 제공하는 클래스
 * 시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우
 * 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요
 */
public class Singleton {
    private Singleton singleton;

    public Singleton getInstance() {
        return new Singleton();
    }
}
