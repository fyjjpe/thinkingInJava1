package com.thinking.statictest;

import static net.mindview.util.Print.*;


/**
 * Created by yuanjie.fang on 2017/9/18.
 */
public class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        print("Table()");
        bowl2.f1(1);
    }

    void f2(int market) {
        print("f2(" + market + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}
