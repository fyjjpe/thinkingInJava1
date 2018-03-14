package com.thinking.statictest;
import static net.mindview.util.Print.*;
/**
 * Created by yuanjie.fang on 2017/9/18.
 */
public class StaticInitialization {
    public static void main(String[] args) {
        print("Createing new Cupboard() in main");
        new Cupboard();
        print("Createing new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
