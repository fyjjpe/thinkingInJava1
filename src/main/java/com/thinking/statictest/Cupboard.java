package com.thinking.statictest;

import static net.mindview.util.Print.*;

/**
 * Created by yuanjie.fang on 2017/9/18.
 */
public class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        print("Cupboard");
        bowl4.f1(2);
    }

    void f3(int market) {
        print("f3(" + market + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}
