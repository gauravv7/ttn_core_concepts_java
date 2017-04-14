package com.threading.basics.q9;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class ThreadSeq extends Thread {

    int init;
    static int maxCapacity = 10;
    int numberOfThreads;
    ThreadSeq(int init, int numberOfThreads) {
        this.init = init;
        this.setName("Thread "+init);
        this.numberOfThreads = numberOfThreads;
    }

    @Override
    public void run() {
        print();
    }

    private void print() {
        for (int i = init; i <= maxCapacity; i+=numberOfThreads) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
