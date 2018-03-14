package com.thinking.section15A;

/**
 * Created by yuanjie.fang on 2017/12/19.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }


    public String toString() {
        return "(" + first + "," + second + ")";
    }

}
