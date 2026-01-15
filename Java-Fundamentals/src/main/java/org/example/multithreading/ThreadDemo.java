package org.example.multithreading;
/*
   -> thread is a smallest unit of a program under execution.
   -> Ways to create threads are:
          - Extending thread class.
          - Implementing Runnable Interface (preferred when existing class extends another class)
   Life Cycle of Thread:
          - New - created but not started.
          - Runnable - Ready to run.
          - Running - currently executing
          - Blocked/ Waiting - waiting for resources.
          - Terminated - Finished execution and exits.
 */


class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Creating Thread using implementing Runnable: "+Thread.currentThread().getName());
    }
}

class ThreadUsingExtend extends Thread {
    @Override
    public void run() {
        System.out.println("Creating Thread via extending Runnable: "+Thread.currentThread().getName());
    }
}

public class ThreadDemo {
    static void main() {
        ThreadUsingExtend t1 = new ThreadUsingExtend();
        Thread t2 = new Thread(new MyRunnableThread());
        t1.start();
        t2.start();
    }
}