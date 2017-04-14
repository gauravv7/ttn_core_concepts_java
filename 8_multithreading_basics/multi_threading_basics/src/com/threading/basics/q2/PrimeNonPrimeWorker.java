package com.threading.basics.q2;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class PrimeNonPrimeWorker extends Thread {

    volatile static int i = 1;
    Object lock;

    PrimeNonPrimeWorker(Object lock) {
        this.lock = lock;
    }

    public static void main(String ar[]) {
        Object obj = new Object();
        // This constructor is required for the identification of wait/notify
        // communication
        PrimeNonPrimeWorker prime = new PrimeNonPrimeWorker(obj);
        PrimeNonPrimeWorker non_prime = new PrimeNonPrimeWorker(obj);
        prime.setName("Prime");
        non_prime.setName("Non Prime");
        prime.start();
        non_prime.start();
    }

    @Override
    public void run() {
        while (i <= 20) {
            int m = i / 2;
            boolean flag = true;

            for (int j = 2; j <= m; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            } //for

            if (flag && Thread.currentThread().getName().equals("Prime")) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " - "
                            + i);
                    i++;
                    lock.notify();
                }
            } else if (!flag && Thread.currentThread().getName().equals("Non Prime")) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " - "
                            + i);
                    i++;
                    lock.notify();
                }
            }
        }
    }
}
