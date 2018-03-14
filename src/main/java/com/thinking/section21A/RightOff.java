package com.thinking.section21A;

/**
 * Created by yuanjie.fang on 2018/1/11.
 */
public class RightOff extends Thread {
    protected int conntDown = 10;
    private static int taskConut = 0;
    private final int id = taskConut++;

    public RightOff() {
    }

    public RightOff(String name) {
        super(name);
    }

    public String status() {
        return "#" + id + "(" + (conntDown > 0 ? conntDown : "Liftoff!") + ").";
    }

    public void run() {
        while (conntDown-- > 0) {
            System.out.print(status());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}
