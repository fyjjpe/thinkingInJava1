package com.thinking.statictest;

import static net.mindview.util.Print.*;

/**
 * Created by yuanjie.fang on 2017/9/18.
 */
public class Bowl {
    Bowl(int market) {
        print("Bowl(" + market + ")");
    }

    void f1(int market) {
        print("f1(" + market + ")");
    }
}
