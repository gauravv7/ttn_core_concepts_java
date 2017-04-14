package com.threading.basics.q10;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class SharedCounter {
    private static Integer counter = 0;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(()->increment(), "t1");
        Thread t2 = new Thread(()->increment(), "t2");

        t1.start(); t1.join(); t2.start(); t2.join();   // main concept is to use join

        long endTime = System.currentTimeMillis();
        System.out.println("Counter: "+SharedCounter.counter);
        System.out.println("Total time taken(in millis): "+(endTime-startTime));
    }

    public static void increment() {
        int i =0;
        while(i<1000){
            synchronized (counter) {
                int temp = counter; // reading counter value
                temp = temp + 1; // increment the value by 1
                counter = temp; // writing back to counter
                i++;
            }
        }
    }
}
