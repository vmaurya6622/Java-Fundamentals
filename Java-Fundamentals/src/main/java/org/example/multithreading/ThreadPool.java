package org.example.multithreading;

import java.lang.reflect.Executable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
    -> It is a mechanism to manage a group of reusable thread for executing a set of tasks.
    -> it helps to prevent creating thread for every task.
    -> hence, when a new task is assigned, thread pool is assigned to the available thread.
 */
public class ThreadPool {
    static void main() {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        for(int i = 0; i <= 10; i++) {
            int taskID=i;
            // submit a task
            pool.execute(new Runnable(){
               @Override
               public void run() {
                   System.out.println("Task "+taskID+" is executed by "+Thread.currentThread().getName());
               }
            });
        }
        pool.shutdown();
    }
}
