package com.pattern.decorator;

/**
 * 饮料的具体实现类
 * 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;// 浓缩咖啡的价格
    }
}
