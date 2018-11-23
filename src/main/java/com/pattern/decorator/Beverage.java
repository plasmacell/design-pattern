package com.pattern.decorator;

/**
 * 装饰者模式
 * 饮料类
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    // 计算花费的金额
    public abstract double cost();
}
