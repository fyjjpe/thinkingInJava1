package com.thinking.test5;

/**
 * Created by yuanjie.fang on 2017/12/7.
 * 测试内部类的继承
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner i = new InheritInner(wi);
    }

}

class WithInner {
    class Inner {
    }
}

