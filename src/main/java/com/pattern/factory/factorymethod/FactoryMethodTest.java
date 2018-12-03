package com.pattern.factory.factorymethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.*;

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

        myThread();
        myFunction();
    }

    private static void myThread() {

        ThreadGroup group = new ThreadGroup("Group");
        group.list();

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("new thread.");
            }
        };
        thread.start();
    }

    private static void myFunction() {
        int[] iArr = {1, 43, 54, 32, 65, 33, 64};
        Arrays.stream(iArr).forEach(System.out::println);
    }

    public void print() {
        if (true) {
            System.out.println(111);
        } else {
            System.out.println("wiee");
        }
    }
}
