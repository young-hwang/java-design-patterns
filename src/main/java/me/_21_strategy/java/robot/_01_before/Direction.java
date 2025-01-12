package me._21_strategy.java.robot._01_before;

public class Direction {
    public int x;
    public int y;

    public Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setDirection(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
