package com.thinking.test;

/**
 * Created by yuanjie.fang on 2017/9/30.
 */
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
        System.out.println(j);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
        System.out.println(j);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }

}

class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }
}
