package com.thinking.enumtest;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by yuanjie.fang on 2017/9/19.
 * enum与switch使用
 */
public class Burrito {
    Spiciness degress;

    public Burrito(Spiciness degree) {
        this.degress = degree;
    }

    public void describe() {
        System.out.print("This burrito is ");
        switch (degress) {
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot. ");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
