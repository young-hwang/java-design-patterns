package me._23_visitor.gof._02_after;

/**
 * Visitor 패턴을 이용하여 수정
 * device는 visitor
 * shape는 element
 */
public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.accept(new Phone());
        Shape triangle = new Triangle();
        triangle.accept(new Watch());
    }
}
