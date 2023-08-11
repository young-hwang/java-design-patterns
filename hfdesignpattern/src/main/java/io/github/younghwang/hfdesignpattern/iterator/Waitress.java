package io.github.younghwang.hfdesignpattern.iterator;

import javax.naming.Name;
import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

    DinnerMenu dinnerMenu = new DinnerMenu();
    MenuItem[] lunchItems = dinnerMenu.getMenuItems();

    void printMen() {
        for (MenuItem item : breakfastItems) {
            System.out.println(item.toString());
        }

        for (int i = 0; i < lunchItems.length; i++) {
            System.out.println(lunchItems[i].toString());
        }
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
}
