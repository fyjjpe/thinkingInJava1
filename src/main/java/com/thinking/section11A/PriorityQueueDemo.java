package com.thinking.section11A;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by yuanjie.fang on 2017/12/8.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);
    }
}
