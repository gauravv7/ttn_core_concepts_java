package com.design.patterns.q3;

/**
 * Created by gauravv7 on 16/4/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("a program to read a file(threadDemo.txt) and print line numbers, if line has more than 15 chars then line itself is printed, using multithreading");
        System.out.println();
        Thread t1=new Thread(new MultiThread(),"A");
        Thread t2=new Thread(new MultiThread(),"B");
        t1.start();
        t2.start();
    }
}
