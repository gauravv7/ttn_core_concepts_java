package com.threading.basics.q7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class PubSub {
    static Integer QUEUE_SIZE = 10;

    static Queue<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Thread producers[] = new Thread[4];
        Thread consumers[] = new Thread[4];
        for (int i = 0; i < 4; i++) {
            producers[i] = new Thread(producer);
            producers[i].start();

            consumers[i] = new Thread(consumer);
            consumers[i].start();
        }
    }

}
