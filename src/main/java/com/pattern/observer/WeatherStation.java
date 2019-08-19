package com.pattern.observer;

/**
 * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 */
public class WeatherStation {

    public static void main(String[] args) {
        // 创建一个weatherData实例(主题)
        WeatherData weatherData = new WeatherData();
        // 创建一个观察者
        CurrentConditionDisplay currentDisplay= new CurrentConditionDisplay(weatherData);
        // 主题更新状态，通知观察者
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
