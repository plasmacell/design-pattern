package com.pattern.factory.factorymethod;

public class GifFactory implements ReaderFactory {

    @Override
    public Reader getReader() {
        return new GifReader();
    }
}
