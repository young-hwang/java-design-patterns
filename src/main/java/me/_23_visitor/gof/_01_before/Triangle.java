package me._23_visitor.gof._01_before;

public class Triangle implements Shape {
    @Override
    public void toPrint(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Triangle to phone");
        } else {
            System.out.println("print Triangle to watch");
        }
    }
}
