package com.pattern.observer;

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
