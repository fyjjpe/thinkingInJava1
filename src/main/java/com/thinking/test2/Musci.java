package com.thinking.test2;

/**
 * Created by yuanjie.fang on 2017/10/17.
 */
public class Musci {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);//Wind.play()MIDDLE_C
    }
}
