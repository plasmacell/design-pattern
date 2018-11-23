package com.pattern.adapter;

/**
 * 德国旅馆
 */
public class Hotel {

    // 旅馆中有一个德标的插口
    private DBSocketInterface dbSocket;

    public void setSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        dbSocket.powerWithTwoRound();
    }
}
