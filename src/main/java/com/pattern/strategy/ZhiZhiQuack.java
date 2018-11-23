package com.pattern.strategy;

/**
 * 鸭子吱吱叫
 */
public class ZhiZhiQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我会吱吱叫...");
    }
}
