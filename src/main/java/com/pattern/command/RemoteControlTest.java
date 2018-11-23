package com.pattern.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        // 创建一个遥控器对象，请求发送者
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        // 创建一个电灯对象，请求接受者
        Light light = new Light();
        // 创建一个命令对象，接收请求接受者，实现发送者和接收者的解耦
        LightOnCommand command = new LightOnCommand(light);
        // 把命令传给调用者，命令对象被参数化
        remoteControl.setCommand(command);
        // 发送请求
        remoteControl.buttonWasPressed();

        // 执行另一个命令
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(doorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}
