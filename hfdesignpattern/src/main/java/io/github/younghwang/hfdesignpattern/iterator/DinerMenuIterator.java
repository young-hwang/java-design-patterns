package io.github.younghwang.hfdesignpattern.iterator;

import java.awt.*;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= this.items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        return this.items[position++];
    }
}