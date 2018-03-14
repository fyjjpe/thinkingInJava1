package com.thinking.test2;

import static net.mindview.util.Print.*;

/**
 * Created by yuanjie.fang on 2017/10/17.
 */
public class Wind extends Instrument {
    public void play(Note n) {
        print("Wind.play()" + n);
    }
}

class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
}
