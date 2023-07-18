package io.github.younghwang.gofbasic._05_prototype._00_model;

public class Client {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        // clone은 Object에 protected로 선언 되어 있어 error
//        ConcretePrototypeB concretePrototypeB = concretePrototypeA.clone();
    }
}
