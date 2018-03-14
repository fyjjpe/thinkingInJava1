package com.thinking.test;

/**
 * Created by yuanjie.fang on 2017/9/30.
 */
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

class Instrument {
    public void play() {
        System.out.println("向上造型");
    }

    static void tune(Instrument i) {
        i.play();
    }
}
