package com.pattern.strategy;

/**
 * 不会飞翔
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不会飞翔...");
    }
}
