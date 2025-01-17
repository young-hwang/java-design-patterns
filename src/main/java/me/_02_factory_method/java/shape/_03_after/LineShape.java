package me._02_factory_method.java.shape._03_after;

// create sub class
public class LineShape extends Shape {
    protected LineShape(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "Line";
    }
}
