package com.thinking.test;

import static net.mindview.util.Print.*;

/**
 * Created by yuanjie.fang on 2017/9/29.
 */
public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}

class Homer {
    char doh(char c) {
        print("doh(char)");
        return 'd';
    }

    float doh(float f) {
        print("doh(float)");
        return 1.0f;
    }
}

class Milhouse {

}

class Bart extends Homer {
    void doh(Milhouse m){
        print("doh(Milhouse)");
    }
}
