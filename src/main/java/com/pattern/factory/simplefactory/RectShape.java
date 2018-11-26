package com.pattern.factory.simplefactory;

/**
 * 简单工厂模式，其实不算一种设计模式，更多的时候是一种编程习惯
 *
 * 定义：定义一个工厂类，根据传入的参数不同，返回不同的实例，被创建的实例具有共同的父类和接口。
 *
 * 适用场景：1、需要创建的对象较少 2、客户端不关心对象的创建过程
 */
public class RectShape implements Shape {

    public RectShape() {
        System.out.println("RectShape: created");
    }

    @Override
    public void draw() {
        System.out.println("draw: Rect");
    }
}
