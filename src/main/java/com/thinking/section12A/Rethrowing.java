package com.thinking.section12A;

/**
 * Created by yuanjie.fang on 2017/12/8.
 */
public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main:g()");
            e.printStackTrace();
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main:h()");
            e.printStackTrace();
        }
    }
}
