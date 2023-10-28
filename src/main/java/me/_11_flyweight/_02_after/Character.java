package me._11_flyweight._02_after;

public class Character {
    private char value;
    private String color;
    private final Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
