package com.thinking.test3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by yuanjie.fang on 2017/11/8.
 */
public class Apply {
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void process(Processor p, Object s) {
        System.out.println("using Processor" + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
