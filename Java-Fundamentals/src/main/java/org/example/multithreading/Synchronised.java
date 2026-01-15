package org.example.multithreading;
/*
    -> Synchronised used where two or more thread try to access and modify the same resource which is commonly called race condition.
        it helps to avoid data corrupts and inconsistency.

     -> Using Synchronised in Java:
            - it uses mutex locks which allows one thread at a time to access a shared resource.
            - Other who want to access have to wait until the lock is released by currently running thread.
 */
class Counter {
    private int count = 0;

    //synchronized method - because this will be used by two threads
    public synchronized void increment() {
        count++;
    }

    public int getCount(){
        return count;
    }
}
public class Synchronised {
    static void main() throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0 ; i<100000 ; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0 ; i<100000 ; i++) {
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count : " + counter.getCount());
    }
}
