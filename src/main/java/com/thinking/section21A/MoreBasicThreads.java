package com.thinking.section21A;

/**
 * Created by yuanjie.fang on 2018/1/11.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new RightOff()).start();
        }
        System.out.println("Waiting for RightOff");
    }
}
