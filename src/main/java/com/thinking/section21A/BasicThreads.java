package com.thinking.section21A;

/**
 * Created by yuanjie.fang on 2018/1/11.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
