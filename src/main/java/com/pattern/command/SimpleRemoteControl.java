package com.pattern.command;

/**
 * “遥控器”对象
 * 调用者
 */
public class SimpleRemoteControl {

    // 遥控器上的“插槽按钮”
    private Command slot;

    public SimpleRemoteControl() {

    }

    // 设置命令到“按钮”上
    public void setCommand(Command command) {
        this.slot = command;
    }

    // 按下按钮，执行请求
    public void buttonWasPressed() {
        slot.execute();
    }
}
