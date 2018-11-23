package com.pattern.adapter;

/**
 * 测试类
 *
 * 需求分析
 * 设计接口
 * 编写文档
 * 功能开发
 */
public class SocketTest {


    public static void main(String[] args) {
        // 有的是三项插孔
        GBSocketInterface gbSocket = new GBSocket();
        // 旅馆只能使用二项插孔
        Hotel hotel = new Hotel();
        // 将三项插孔适配成二项
        SocketAdapter adapter = new SocketAdapter(gbSocket);
        // 插入插头
        hotel.setSocket(adapter);
        // 充电
        hotel.charge();
    }
}
