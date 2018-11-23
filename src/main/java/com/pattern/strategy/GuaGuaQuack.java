package com.pattern.strategy;

/**
 * 鸭子呱呱叫
 */
public class GuaGuaQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我会呱呱叫...");
    }
}
