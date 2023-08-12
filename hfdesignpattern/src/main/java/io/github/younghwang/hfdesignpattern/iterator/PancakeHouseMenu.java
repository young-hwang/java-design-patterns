package io.github.younghwang.hfdesignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancake", "Pankes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return this.menuItems.iterator();
    }
}
