package com.pattern.state.improve;

/**
 * 改进的糖果机
 * 现在我们会把一个状态的所有行为放在一个类中，这么一来我们将行为局部化了，
 * 并使得事情更容易改变和理解。
 *
 * 每个状态类都会继承这个接口，实现所有的动作
 */
public interface State {// 所有的状态接口，定义了所有可能发生的动作

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
