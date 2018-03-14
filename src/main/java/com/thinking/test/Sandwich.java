package com.thinking.test;

import static net.mindview.util.Print.*;

/**
 * Created by yuanjie.fang on 2017/10/17.
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Sandwich(){
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() {
        print("Bread()");
    }
}

class Cheese {
    Cheese() {
        print("Cheese");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}
