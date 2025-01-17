package me._02_factory_method.java.shape._02_after;

public class Main {
    public static void main(String[] args) {
        Shape line = Shape.create(Shape.TYPECODE_LINE, 0, 0, 100, 200);
        Shape rectangle = Shape.create(Shape.TYPECODE_RECTANLE, 10, 20, 30, 40);
        Shape oval = Shape.create(Shape.TYPECODE_OVAL, 100, 200, 300, 400);

        Shape[] shapes = {line, rectangle, oval};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
