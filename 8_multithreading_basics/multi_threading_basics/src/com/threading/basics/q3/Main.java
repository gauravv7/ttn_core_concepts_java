package com.threading.basics.q3;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Q3.ThreeThreads(1));
        Thread t2 = new Thread(new Q3.ThreeThreads(2));
        Thread t3 = new Thread(new Q3.ThreeThreads(3));
        t1.start();
        t2.start();
        t3.start();

    }
}
