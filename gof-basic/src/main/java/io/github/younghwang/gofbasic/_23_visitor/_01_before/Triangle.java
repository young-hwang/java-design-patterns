package io.github.younghwang.gofbasic._23_visitor._01_before;

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
