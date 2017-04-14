package com.threading.basics.q8;

/**
 * Created by gauravv7 on 14/4/17.
 */
class Producer extends PubSub implements Runnable {

    @Override
    public void run() {
        int index = 0;

        while (true) {
            while (queue.size() == QUEUE_SIZE) {
                try {
                    System.out.println("Producer waits");
                    queue.notify();
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Produce element " + (++index));
            queue.add(index);
            queue.notify();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
