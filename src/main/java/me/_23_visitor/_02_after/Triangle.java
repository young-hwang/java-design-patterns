package me._23_visitor._02_after;

public class Triangle implements Shape {
    @Override
    public void accept(Device device) {
        device.toPrint(this);
    }
}
