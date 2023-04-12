package io.younghwang.basemodel._23_visitor._00_model;

/**
 * 기존 코드를 변경하지 않고 새로운 기능을 추가하는 방법이다.
 * Double Dispatch 를 활용 할 수 있다.
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {

    }

    @Override
    public void visit(ElementB elementB) {

    }
}
