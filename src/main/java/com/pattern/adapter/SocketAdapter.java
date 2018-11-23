package com.pattern.adapter;

/**
 * 适配器
 *
 * 实现德标接口，有二项插头的样子
 * 组合国标接口，使用三项插头的功能
 */
public class SocketAdapter implements DBSocketInterface {

    private GBSocketInterface gbSocket;


    public SocketAdapter(GBSocketInterface gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void powerWithTwoRound() {
        gbSocket.powerWithThreeFlat();
    }
}
