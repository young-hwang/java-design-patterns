package me._02_factory_method.java.shape._03_after;

public abstract class Shape {
    private final int startx;
    private final int starty;
    private final int endx;
    private final int endy;

    protected Shape(final int startx, final int starty, final int endx, final int endy) {
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return "{" +
                "typeCode=" + getName() +
                ", startx=" + startx +
                ", starty=" + starty +
                ", endx=" + endx +
                ", endy=" + endy +
                '}';
    }

    public void draw() {
        System.out.println(getName() + ": " + toString());
    }

    public static Shape createLine(int startx, int starty, int endx, int endy) {
        return new LineShape(startx, starty, endx, endy);
    }

    public static Shape createRectangle(int startx, int starty, int endx, int endy) {
        return new RectangleShape(startx, starty, endx, endy);
    }

    public static Shape createOval(int startx, int starty, int endx, int endy) {
        return new OvalShape(startx, starty, endx, endy);
    }
}
