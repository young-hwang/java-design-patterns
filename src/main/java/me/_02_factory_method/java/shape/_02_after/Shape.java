package me._02_factory_method.java.shape._02_after;

public class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int typeCode;
    private final int startx;
    private final int starty;
    private final int endx;
    private final int endy;

    // hidden constructor
    private Shape(int typeCode, final int startx, final int starty, final int endx, final int endy) {
        this.typeCode = typeCode;
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public String getName() {
        if (typeCode == TYPECODE_LINE) {
            return "LINE";
        } else if (typeCode == TYPECODE_RECTANLE) {
            return "RECTANLE";
        } else if (typeCode == TYPECODE_OVAL) {
            return "OVAL";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "typeCode=" + typeCode +
                ", startx=" + startx +
                ", starty=" + starty +
                ", endx=" + endx +
                ", endy=" + endy +
                '}';
    }

    public void draw() {
        switch (typeCode) {
            case TYPECODE_LINE:
                drawLine();
                break;
            case TYPECODE_RECTANLE:
                drawRectangle();
                break;
            case TYPECODE_OVAL:
                drawOval();
                break;

        }
    }

    private void drawOval() {
        System.out.println(getName() + ": " + toString());
    }

    private void drawRectangle() {
        System.out.println(getName() + ": " + toString());
    }

    private void drawLine() {
        System.out.println(getName() + ": " + toString());
    }

    // add factory method
    public static Shape create(int typeCode, int startx, int starty, int endx, int endy) {
        return new Shape(typeCode, startx, starty, endx, endy);
    }
}
