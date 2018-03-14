package com.thinking.section15A;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjie.fang on 2017/12/19.
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABVDEFG".split(""));
        System.out.println(ls);
    }
}
