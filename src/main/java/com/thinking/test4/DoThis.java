package com.thinking.test4;

/**
 * Created by yuanjie.fang on 2017/11/14.
 */
public class DoThis {
    void f(){
        System.out.println("DoThis.f()");
    }

    public class Inner{
        public DoThis outer(){
            return DoThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        Inner inner = dt.inner();
        inner.outer().f();
    }
}
