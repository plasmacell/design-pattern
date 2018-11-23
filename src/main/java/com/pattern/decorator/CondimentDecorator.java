package com.pattern.decorator;

/**
 * 调料类
 */
public abstract class CondimentDecorator extends Beverage {

    // 重新实现getDescription()方法
    public abstract String getDescription();
}
