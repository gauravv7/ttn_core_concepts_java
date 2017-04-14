package com.threading.basics.q6;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class ArrayMaxValue extends Thread {
    private int[] arr;

    private int low, high, partialMax;

    public ArrayMaxValue(int[] arr, int low, int high) {
        this.arr = arr;
        this.low = low;
        this.high = Math.min(high, arr.length);
    }

    public int getPartialMax() {
        return partialMax;
    }

    public void run() {
        partialMax = findMax(arr, low, high);
    }

    public static int findMax(int[] arr) {
        return findMax(arr, 0, arr.length);
    }

    public static int findMax(int[] arr, int low, int high) {
        int max = arr[0];

        for (int i = low; i < high; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    public static int ConcurrentMax(int[] arr, int threads) {
        int size = (int) Math.ceil(arr.length * 1.0 / threads);

        ArrayMaxValue[] maximums = new ArrayMaxValue[threads];

        for (int i = 0; i < threads; i++) {
            maximums[i] = new ArrayMaxValue(arr, i * size, (i + 1) * size);
            maximums[i].start();
        }

        try {
            for (ArrayMaxValue max : maximums) {
                max.join();
            }
        } catch (InterruptedException e) { }

        int max = maximums[0].getPartialMax();

        for (ArrayMaxValue parMax : maximums) {
            if(max<parMax.getPartialMax()){
                max = parMax.getPartialMax();
            }
        }

        return max;
    }
}
