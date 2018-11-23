package com.pattern.strategy;

/**
 * 所有鸭子的父类
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    // 鸭子的外貌
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("我们都会游泳...");
    }
}
