package com.thinking.test;

import static net.mindview.util.Print.print;

/**
 * Created by yuanjie.fang on 2017/9/28.
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

class Game {
    Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}