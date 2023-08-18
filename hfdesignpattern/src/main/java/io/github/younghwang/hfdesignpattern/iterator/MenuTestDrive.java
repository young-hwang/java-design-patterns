package io.github.younghwang.hfdesignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        MenuComponent allMenus = new MenuList("ALL MENUS", "All menus combined");
        MenuList pancakeHouseMenuList = new MenuList("PAN CAKE HOUSE MENU", "Breakfast");
        addMenuList(pancakeHouseMenu, pancakeHouseMenuList);

        MenuList dinerMenuList = new MenuList("DINER MENU", "Lunch");
        addMenuList(dinerMenu, dinerMenuList);

        MenuList dessertMenuList = new MenuList("DESSERT MENU", "Dessert of course");
        dessertMenuList.add(new MenuItem("Apple Pie with flakey crust, topped with vanilla icecream", "Apple pie ", true, 1.59));
        dessertMenuList.add(new MenuItem("Blueberry Pie, with flakey crust, topped with blueberry icecream", "", true, 1.49));
        dinerMenuList.add(dessertMenuList);

        MenuList cafeMenuList = new MenuList("CAFE MENU", "Dinner");
        addMenuList(cafeMenu, cafeMenuList);

        allMenus.add(pancakeHouseMenuList);
        allMenus.add(dinerMenuList);
        allMenus.add(cafeMenuList);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }

    private static void addMenuList(Menu menu, MenuList menuList) {
        Iterator iterator = menu.createIterator();
        while (iterator.hasNext()) {
            menuList.add((MenuComponent) iterator.next());
        }
    }
}
