package io.younghwang.basemodel._23_visitor._02_after;

/**
 * Visitor 패턴을 이용하여 수정
 * device는 visitor
 * shape는 element
 * 장접
 * element의 변경 없이 device 추가 가능
 * 단점
 * 구조가 복잡(double dispatch 이해)
 * device의 static한 타입으로 element 추가 변경 시 많은 변경이 필요
 */
public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.accept(new Phone());
        Shape triangle = new Triangle();
        triangle.accept(new Watch());
    }
}
