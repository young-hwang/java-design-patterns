package me._02_factory_method.java.shape._03_after;

public class OvalShape extends Shape {
    protected OvalShape(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "Oval";
    }
}
