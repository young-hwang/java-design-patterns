package io.github.younghwang.hfdesignpattern.iterator;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    void printMen() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    void printBreakfastMenu() {

    }

    void printLunchMenu() {

    }

    void printVegetarianMenu() {

    }

    boolean isItemVegetarian(String name) {
        return true;
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
