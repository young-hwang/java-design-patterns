package io.younghwang.basemodel._23_visitor._02_after;

public class Rectangle implements Shape {
    @Override
    public void accept(Device device) {
        device.toPrint(this);
    }
}
