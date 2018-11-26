package com.pattern.factory.simplefactory;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();
    }
}
