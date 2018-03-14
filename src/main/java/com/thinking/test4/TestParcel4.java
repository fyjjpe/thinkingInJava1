package com.thinking.test4;

/**
 * Created by yuanjie.fang on 2017/11/14.
 */
public class TestParcel4 {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}
