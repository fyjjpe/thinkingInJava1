package com.thinking.test;

import static net.mindview.util.Print.*;

/**
 * Created by yuanjie.fang on 2017/9/12.
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x,y,z";
        print(s + x + y + z);
        print(x + " " + s);
        s += "(summed) = ";
        print(s + (x + y + z));
        print("" + x);

        /*
            x,y,z012
            0 x,y,z
            x,y,z(summed) = 3
            0
        */

    }

}
