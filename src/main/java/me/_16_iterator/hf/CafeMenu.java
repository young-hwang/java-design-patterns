package me._16_iterator.hf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with ad sal", true, 3.99);
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Map<String, MenuItem> getItems() {
        return this.menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return this.menuItems.values().iterator();
    }
}
