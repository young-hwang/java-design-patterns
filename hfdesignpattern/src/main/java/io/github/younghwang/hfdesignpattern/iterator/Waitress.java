package io.github.younghwang.hfdesignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    void printMenu() {
        this.allMenus.print();
    }
}
