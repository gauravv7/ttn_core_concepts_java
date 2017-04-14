package com.threading.basics.q7;

/**
 * Created by gauravv7 on 14/4/17.
 */
class Consumer extends PubSub implements Runnable{

    @Override
    public void run() {
        while (true) {
            synchronized(queue) {

                while (queue.isEmpty()){
                    try {
                        System.out.println("Consumer waits");
                        queue.notify();
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Consume element " + queue.poll());
                queue.notify();

            }
        }

    }

}

