package me._23_visitor._01_before;

/**
 * 각 Shape에서 device를 받아서 출력하는 기능
 * device가 추가 될 때마다 코드가 장황해진다.
 */
public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.toPrint(new Phone());
        Shape triangle = new Triangle();
        triangle.toPrint(new Phone());
    }
}
