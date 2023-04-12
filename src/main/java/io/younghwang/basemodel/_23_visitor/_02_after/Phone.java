package io.younghwang.basemodel._23_visitor._02_after;

public class Phone implements Device {

    @Override
    public void toPrint(Triangle triangle) {
        System.out.println("print Triangle to phone");
    }

    @Override
    public void toPrint(Rectangle rectangle) {
        System.out.println("print Rectangle to phone");
    }

}
