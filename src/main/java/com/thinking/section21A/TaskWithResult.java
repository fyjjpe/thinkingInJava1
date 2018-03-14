package com.thinking.section21A;

import java.util.concurrent.Callable;

/**
 * Created by yuanjie.fang on 2018/1/11.
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() throws Exception {
        return "result:" + id;
    }
}
