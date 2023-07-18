package io.github.younghwang.gofbasic._08_composite._02_after;

public class Item implements Component {
    private final String name;
    private final int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
