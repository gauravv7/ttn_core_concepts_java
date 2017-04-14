package com.threading.basics.q4;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class ReverseHello extends Thread {

    int counter;

    public ReverseHello(int counter) {
        this.counter=counter;
    }

    public static void main(String[] arg) {
        ReverseHello t = new ReverseHello(1);
        t.start();
    }

    public void run() {
        if(counter<10) {
            createThread(counter+1);
        }
        System.out.println("Hello from thread " + counter);
    }

    public void createThread(int counter) {
        ReverseHello t=new ReverseHello(counter);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}