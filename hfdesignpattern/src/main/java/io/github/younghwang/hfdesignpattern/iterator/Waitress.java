package io.github.younghwang.hfdesignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;
//    Menu cafeMenu;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//        this.cafeMenu = cafeMenu;
//    }

    void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            printMenu(menuIterator.next().createIterator());
        }
//        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//        System.out.println("MENU - BREAKFAST");
//        printMenu(pancakeIterator);
//        System.out.println("MENU - LUNCH");
//        printMenu(dinerIterator);
//        System.out.println("MENU - DINNER");
//        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
