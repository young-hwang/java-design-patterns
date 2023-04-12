package io.younghwang.basemodel._23_visitor._01_before;

public class Rectangle implements Shape {
    @Override
    public void toPrint(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Rectangle to phone");
        } else {
            System.out.println("print Rectangle to watch");
        }
    }
}
