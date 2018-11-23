package com.pattern.template;

/**
 * 具体实现类：茶
 */
public class Tea extends CaffeineBeverage {


    @Override
    public void brew() {
        System.out.println("Stepping the tea...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon...");
    }
}
