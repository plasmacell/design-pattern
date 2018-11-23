package com.pattern.template;

/**
 * 模块方法模式
 *
 * 抽象类：咖啡因饮料
 */
public abstract class CaffeineBeverage {

    // 制作饮料的步骤，定义成final，防止子类重写
    public final void prepareRecipe() {// 模板方法
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 公用的方法抽到基类中
    public void boilWater() {
        System.out.println("Boiling water...");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // 需要具体实现的方法，定义成抽象类型，由子类去实现
    public abstract void brew();
    public abstract void addCondiments();
}
