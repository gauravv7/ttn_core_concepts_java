package com.threading.basics.q9;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class Main {

    public static void main(String[] args) {

        ThreadSeq threadSeq[] = new ThreadSeq[4];

        for (int i = 1; i <= 4; i++) {
            threadSeq[i-1] = new ThreadSeq(i, 4);
            threadSeq[i-1].start();
        }
    }
}
