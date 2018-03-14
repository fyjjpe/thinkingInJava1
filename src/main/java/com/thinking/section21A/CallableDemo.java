package com.thinking.section21A;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by yuanjie.fang on 2018/1/11.
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec= Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs:results) {
            try {
                System.out.println(fs.get());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        
    }
}
