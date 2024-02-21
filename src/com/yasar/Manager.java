package com.yasar;

import com.yasar.utility.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Manager {
    private String id;
    private Menu menu;
    private List<Menu> menuList;

    public Manager() {
        this.menu = new Menu();
        this.menuList = new ArrayList<>();
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void showMenu() {
        System.out.println("""
                *****************************
                ****   HAFTANIN MENÜSÜ   ****
                *****************************
                """);
        todaysMenu();
    }

    public void todaysMenu() {
        EDay[] days = EDay.values();
        for (int i = 0; i < days.length; i++) {
            menu.setDay(days[i]);
            System.out.println(menu.getDay());
            menu.todaysSoup();
            menu.todaysFood();
            menu.todaysDessert();
            menu.todaysDrink();
            System.out.println("-----------------------");
            this.menuList.add(menu);
            this.menu = new Menu();
        }
    }

    public void menuList() {
        this.menuList.forEach(System.out::println);
    }
}
