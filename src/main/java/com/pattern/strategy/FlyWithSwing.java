package com.pattern.strategy;

/**
 * 用翅膀飞翔
 */
public class FlyWithSwing implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我是用翅膀飞翔的...");
    }
}
