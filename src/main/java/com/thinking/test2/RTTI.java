package com.thinking.test2;

/**
 * Created by yuanjie.fang on 2017/10/25.
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(),new MoreUseful()};
        x[0].f();
        x[1].g();
    }
}

class Useful{
    public void f(){}
    public void g(){}
}

class MoreUseful extends Useful{
    public void f(){}
    public void g(){}
    public void u(){}
    public void v(){}
}
