package com.pattern.singleton;

/**
 * 测试类
 */
public class TestSingleton {

    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println(singleton == singleton1);

        HungarySingleton instance = HungarySingleton.getInstance();
        HungarySingleton instance1 = HungarySingleton.getInstance();
        System.out.println(instance == instance1);
    }
}
