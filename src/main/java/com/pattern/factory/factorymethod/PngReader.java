package com.pattern.factory.factorymethod;

public class PngReader implements Reader {

    @Override
    public void read() {
        System.out.println("read png");
    }
}
