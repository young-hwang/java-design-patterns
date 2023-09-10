package me._23_visitor.gof._02_after;

public interface Device {
    void toPrint(Triangle triangle);

    void toPrint(Rectangle rectangle);
}
