package io.github.younghwang.hfdesignpattern.iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    void printMen() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU - BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("MENU - LUNCH");
        printMenu(dinerIterator);
        System.out.println("MENU - DINNER");
        printMenu(cafeIterator);
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
