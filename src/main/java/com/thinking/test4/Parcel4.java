package com.thinking.test4;

/**
 * Created by yuanjie.fang on 2017/11/14.
 */
public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        public String readLabel() {
            return label;
        }

        private PDestination(String whereTo){
            label = whereTo;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }
}


