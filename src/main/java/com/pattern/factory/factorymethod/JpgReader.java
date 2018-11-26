package com.pattern.factory.factorymethod;

public class JpgReader implements Reader {

    @Override
    public void read() {
        System.out.println("read jpg");
    }
}
