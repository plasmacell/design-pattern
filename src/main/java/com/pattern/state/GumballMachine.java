package com.pattern.state;

/**
 * 糖果机
 * 每执行完一个动作都会导致状态的装换，所以需要在执行完一个动作后，进行当前状态的检查
 *
 */
public class GumballMachine {

    // 糖果售罄
    public static final int SOLD_OUT = 0;
    // 没有“25分钱”，投钱就能够购买糖果
    public static final int NO_QUARTER = 1;
    // 有“25分钱”
    public static final int HAS_QUARTER = 2;
    // 售出糖果
    public static final int SOLD = 3;

    private int state = SOLD_OUT; // 标记当前机器状态
    private int count;// 机器里的糖果数量

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {// 如果糖果不为0，那么机器就进入可投钱状态
            state = NO_QUARTER;
        }
    }

    // 投入“25分钱”
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter.");// 已经投过钱了，不用再投了
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out.");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball.");
        }
    }

    // 退出“25分钱”
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned.");
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter.");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank.");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet.");
        }
    }

    // 转动曲柄
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball.");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    // 发放糖果
    private void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops!,out of gumballs!");
                state = SOLD_OUT;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("you need to pay first.");
        } else if (state == SOLD_OUT) {
            System.out.println("no gumball dispensed.");
        } else if (state == HAS_QUARTER) {
            System.out.println("no gumball dispensed.");
        }
    }


}
