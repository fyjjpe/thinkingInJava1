package com.thinking.test5;

/**
 * Created by yuanjie.fang on 2017/12/7.
 * 测试内部类能否被覆盖
 */
public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg yolk");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}

class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg yolk");
        }
    }

    public Egg(){
        System.out.println("New yolk");
        y = new Yolk();
    }
}




