package me._16_iterator.hf;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", true, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", true, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!! Can't add item ot menu");
        } else {
            this.menuItems[numberOfItems++] = menuItem;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new AlternatingDinerMenuIterator(this.menuItems);
//        return new DinerMenuIterator(this.menuItems);
    }
}
