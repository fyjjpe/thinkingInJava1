package com.thinking.section16A;

/**
 * Created by yuanjie.fang on 2017/12/20.
 */
public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);
        System.out.println(ints2);
        System.out.println(doubles2);
    }
}


class ClassParameter<T> {
    public T[] f(T[] arg) {
        System.out.println("1:" + arg);
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        System.out.println("2:" + arg);
        return arg;
    }
}