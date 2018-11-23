package com.pattern.command;

/**
 * “打开电灯”的命令对象
 *
 * 封装“电灯”对象
 * 执行开灯操作
 *
 * 即，命令对象中封装了请求和接受者对象
 */
public class LightOnCommand implements Command {

    // 引入“电灯”对象
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    // 执行开灯操作
    @Override
    public void execute() {
        light.on();
    }
}
