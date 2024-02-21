package com.yasar;

import com.yasar.utility.*;

import java.util.Random;
import java.util.UUID;

public class Menu {
    private String id;
    private EFood food;
    private ESoup soup;
    private EDrink drink;
    private EDessert dessert;
    private EDay day;

    public Menu() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Menu{");
        sb.append("id='").append(id).append('\'');
        sb.append(", food=").append(food);
        sb.append(", soup=").append(soup);
        sb.append(", drink=").append(drink);
        sb.append(", dessert=").append(dessert);
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EFood getFood() {
        return food;
    }

    public void setFood(EFood food) {
        this.food = food;
    }

    public ESoup getSoup() {
        return soup;
    }

    public void setSoup(ESoup soup) {
        this.soup = soup;
    }

    public EDrink getDrink() {
        return drink;
    }

    public void setDrink(EDrink drink) {
        this.drink = drink;
    }

    public EDessert getDessert() {
        return dessert;
    }

    public void setDessert(EDessert dessert) {
        this.dessert = dessert;
    }

    public EDay getDay() {
        return day;
    }

    public void setDay(EDay day) {
        this.day = day;
    }

    public void todaysSoup() {
        ESoup[] soups = ESoup.values();
        int randomIndex = new Random().nextInt(soups.length);
        this.setSoup(soups[randomIndex]);
        System.out.println("Günün Çorbası ... : " + getSoup());
    }

    public void todaysFood() {
        EFood[] foods = EFood.values();
        int randomIndex = new Random().nextInt(foods.length);
        this.setFood(foods[randomIndex]);
        System.out.println("Günün Yemeği .... : " + getFood());
    }

    public void todaysDessert() {
        EDessert[] desserts = EDessert.values();
        int randomIndex = new Random().nextInt(desserts.length);
        this.setDessert(desserts[randomIndex]);
        System.out.println("Günün Tatlısı ... : " + getDessert());
    }

    public void todaysDrink() {
        EDrink[] drinks = EDrink.values();
        int randomIndex = new Random().nextInt(drinks.length);
        this.setDrink(drinks[randomIndex]);
        System.out.println("Günün İçeçeği ... : " + getDrink());
    }

}
