package com.pattern.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        // new一个浓缩咖啡对象
        Beverage espresso = new Espresso();
        // 输出不加任何调料时的描述和价格
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        // new一个混合咖啡对象
        Beverage houseBlendCoffee = new HouseBlendCoffee();
        // 加一点摩卡调料
        Beverage mocha = new Mocha(houseBlendCoffee);
        // 输出“摩卡混合咖啡”
        System.out.println(mocha.getDescription() + " $" + mocha.cost());
    }
}
