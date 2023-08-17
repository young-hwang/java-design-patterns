package io.github.younghwang.hfdesignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuList extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    Iterator<MenuComponent> iterator = null;
    String name;
    String description;

    public MenuList(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        this.menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        this.menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return this.menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            next.print();
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Iterator<MenuComponent> createIterator() {
        if (this.iterator == null) {
            this.iterator = new CompositeIterator(this.menuComponents.iterator());
        }
        return this.iterator;
    }
}
