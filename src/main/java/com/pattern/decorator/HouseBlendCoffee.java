package com.pattern.decorator;

/**
 * 饮料的具体实现类
 * 混合咖啡
 */
public class HouseBlendCoffee extends Beverage {

    public HouseBlendCoffee() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
