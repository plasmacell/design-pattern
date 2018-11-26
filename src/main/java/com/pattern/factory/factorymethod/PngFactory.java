package com.pattern.factory.factorymethod;

public class PngFactory implements ReaderFactory {

    @Override
    public Reader getReader() {
        return new PngReader();
    }
}
