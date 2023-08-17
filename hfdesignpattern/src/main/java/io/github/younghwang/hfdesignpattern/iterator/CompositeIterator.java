package io.github.younghwang.hfdesignpattern.iterator;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private final Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (this.stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = this.stack.peek();
            if (!iterator.hasNext()) {
                this.stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = this.stack.peek();
            MenuComponent component = iterator.next();
            this.stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }
}
