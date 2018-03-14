package com.thinking.section15A;

/**
 * Created by yuanjie.fang on 2017/12/19.
 * 测试泛型方法
 */
public class GenericMethids {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethids gm = new GenericMethids();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0f);
        gm.f('c');
        gm.f(gm);
    }
}
