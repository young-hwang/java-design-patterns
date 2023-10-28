package me._23_visitor.gof._02_after;

public class Rectangle implements Shape {
    @Override
    public void accept(Device device) {
        device.toPrint(this);
    }
}
