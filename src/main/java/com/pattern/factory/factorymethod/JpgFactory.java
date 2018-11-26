package com.pattern.factory.factorymethod;

public class JpgFactory implements ReaderFactory {

    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
