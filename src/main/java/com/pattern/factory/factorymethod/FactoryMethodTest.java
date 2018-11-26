package com.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ReaderFactory pngFactory = new PngFactory();
        Reader reader = pngFactory.getReader();
        reader.read();

        ReaderFactory gifFactory = new GifFactory();
        Reader reader1 = gifFactory.getReader();
        reader1.read();

        ReaderFactory jpgFactory = new JpgFactory();
        Reader reader2 = jpgFactory.getReader();
        reader2.read();
    }
}
