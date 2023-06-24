package io.younghwang.basemodel._02_factory_method._00_model;

/**
 * 구체적으로 어떤 인스턴스를 만들지는 서브 클래스 결정
 * 다양한 구현체 (Product)가 있고, 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리 (Creator)를 제공
 */
public class ConcreteCreator implements Creator {
    @Override
    public void templateMethod() {

    }

    @Override
    public Product createProduct() {
        return null;
    }
}
