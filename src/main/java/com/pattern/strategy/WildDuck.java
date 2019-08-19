package com.pattern.strategy;

/**
 * 野鸭
 * 定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。
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
