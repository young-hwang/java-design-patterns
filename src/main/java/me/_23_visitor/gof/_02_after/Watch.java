package me._23_visitor.gof._02_after;

public class Watch implements Device {
    @Override
    public void toPrint(Triangle triangle) {
        System.out.println("print Triangle to watch");
    }

    @Override
    public void toPrint(Rectangle rectangle) {
        System.out.println("print Rectangle to watch");
    }
}
