package com.pattern.adapter;

/**
 * 国标插座
 */
public class GBSocket implements GBSocketInterface {

    @Override
    public void powerWithThreeFlat() {
        System.out.println("使用三项扁头的插孔供电");
    }
}
