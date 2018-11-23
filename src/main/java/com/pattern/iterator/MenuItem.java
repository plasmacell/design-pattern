package com.pattern.iterator;

import java.util.Iterator;

/**
 * 迭代器模式：对遍历进行封装
 *
 * 合并早餐和午餐的菜单，但是两种菜单的实现方式是不一样的
 * 早餐用的是ArrayList，午餐用的是数组
 */
public class MenuItem {

    private String name;

    private String description;

    private boolean vegetarian;// 是否为素食

    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
