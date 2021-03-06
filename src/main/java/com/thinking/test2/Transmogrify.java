package com.thinking.test2;

import static net.mindview.util.Print.*;

/**
 * Created by yuanjie.fang on 2017/10/25.
 */
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}

class Actor {
    public void act() {
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        print("HappyActor");
    }
}

class SadActor extends Actor{
    @Override
    public void act() {
        print("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
