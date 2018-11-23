package com.pattern.singleton;

/**
 * 单例模式：饿汉式
 */
public class HungarySingleton {

    // 创建类的唯一实例
    private static HungarySingleton instance = new HungarySingleton();

    // 提供私有构造器
    private HungarySingleton() {
    }

    // 向外提供获取实例对象的方法
    public static HungarySingleton getInstance() {
        return instance;
    }
}
