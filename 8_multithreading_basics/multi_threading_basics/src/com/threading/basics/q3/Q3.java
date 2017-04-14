package com.threading.basics.q3;

/**
 * Created by gauravv7 on 14/4/17.
 */
public class Q3 {
    static Object monitor = new Object();

    static boolean one = true;
    static boolean two = false;
    static boolean three = false;

    static class ThreeThreads implements Runnable {

        int threadId;

        ThreeThreads(int threadId) {
            this.threadId = threadId;
        }

        public void run() {
            print();
        }

        private void print() {
            try {
                while (true) {
                    Thread.sleep(500);
                    synchronized (monitor) {
                        if (1 == threadId) {
                            if (!one) {
                                monitor.wait();
                            } else {
                                System.out.println("Thread "+threadId);
                                one = false;
                                two = true;
                                three = false;
                                monitor.notifyAll();
                            }
                        }
                        if (2 == threadId) {
                            if (!two) {
                                monitor.wait();
                            } else {
                                System.out.println("Thread "+threadId);
                                one = false;
                                two = false;
                                three = true;
                                monitor.notifyAll();
                            }
                        }
                        if (3 == threadId) {
                            if (!three) {
                                monitor.wait();
                            } else {
                                System.out.println("Thread "+threadId);
                                one = true;
                                two = false;
                                three = false;
                                monitor.notifyAll();
                            }
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
