package com.thinking.section13A;

/**
 * Created by yuanjie.fang on 2017/12/13.
 */
public class IntegerMatch {
    public static void main(String[] args) {
//        System.out.println("-56789".matches("-?\\d+"));


        for (String pattern: new String[]{"Rudolph","[rR]udolph",
        "[rR][aeiou][a-z]ol.*","R.*"}) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
