package com.thinking.section19A;

import com.sun.org.apache.xpath.internal.SourceTree;

import static com.thinking.section19A.Spiciness.NOT;

/**
 * Created by yuanjie.fang on 2018/1/9.
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito{" +
                "degree=" + degree +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
    }
}
