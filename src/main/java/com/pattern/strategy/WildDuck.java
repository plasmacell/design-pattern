package com.pattern.strategy;

/**
 * 野鸭
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new FlyWithSwing();
        quackBehavior = new ZhiZhiQuack();
    }

    @Override
    public void display() {
        System.out.println("我是一只非常帅气的野鸭...");
    }

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.swim();
        wildDuck.display();
        wildDuck.performFly();
        wildDuck.performQuack();


    }
}
