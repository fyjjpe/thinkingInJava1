package com.thinking.section19A;

/**
 * Created by yuanjie.fang on 2018/1/9.
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s:Shrubbery.values()) {
            System.out.println(s.ordinal());
            System.out.println(s.name());
        }
        System.out.println("-------------------");
        System.out.println(Enum.valueOf(Shrubbery.class,"CRAWLING"));

    }
}
