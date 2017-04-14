package com.threading.basics.q5;

import java.util.Random;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class Main {

    public static final int THREADS = 4;

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101) + 1; // 1..100
        }

        for (int a: arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
        System.out.println("Sum is: "+ArrayAddition.ConcurrentSum(arr, THREADS));
    }
}
