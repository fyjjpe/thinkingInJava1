package com.thinking.test;

import static net.mindview.util.Print.print;

/**
 * Created by yuanjie.fang on 2017/9/28.
 */
public class Cartoon extends Drawing{
    public Cartoon(){
        print("Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art(){
        print("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        print("Drawing constructor");
    }
}
