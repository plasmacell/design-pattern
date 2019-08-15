package com.pattern.singleton;

/**
 * 单例模式：懒汉式
 * 
 * 懒汉式单例模式不是线程安全的，线程不安全体现在实例化instance时。
 */
public class LazySingleton {

    // 声明一个保存实例的引用
    private static LazySingleton instance;

    // 私有化构造器
    private LazySingleton() {

    }

    // 向外提供一个获取实例的方法
    public static LazySingleton getInstance() {
        // 在需要时创建一个实例，而不是上来就创建一个
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
