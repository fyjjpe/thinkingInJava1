package com.thinking.test;

/**
 * Created by yuanjie.fang on 2017/9/11.
 */
public class Literals {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(0x2f));
        System.out.println(Integer.toBinaryString(0X2F));
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
    }
}
