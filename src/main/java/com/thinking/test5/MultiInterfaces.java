package com.thinking.test5;

/**
 * Created by yuanjie.fang on 2017/12/7.
 */
public class MultiInterfaces {
    static void tasksA(A a) {
    }

    static void tasksB(B b) {

    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        tasksA(x);
        tasksA(y);
        tasksB(x);
        tasksB(y.makeB());
    }
}

interface A {
}

interface B {
}

class X implements A, B {

}

class Y implements A {
    B makeB() {
        return new B() {
        };
    }
}
