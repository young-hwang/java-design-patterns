package me._21_strategy.java.robot._02_after;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void relativeMove(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
