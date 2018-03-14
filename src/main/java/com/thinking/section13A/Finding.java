package com.thinking.section13A;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yuanjie.fang on 2017/12/13.
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is full of linnet's wings");
        while (m.find()) {
            System.out.println(m.group() + " ");
        }
        int i = 0;
        while (m.find(i)) {
            System.out.println(m.group() + " ");
            i++;
        }
        System.out.println("------------------------");


        //测试分隔字符串类StringTokenizer
        StringTokenizer st = new StringTokenizer("This is a demo");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken()+" ");
        }
    }


}
