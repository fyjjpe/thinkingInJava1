package com.thinking.section11A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuanjie.fang on 2017/12/7.
 */
public class test1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("G");
        set.add("J");
        set.add("C");
        set.add("D");
        System.out.println(set);
    }
}


class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}