package org.example.multithreading;

import java.util.concurrent.ExecutorService;

/*
    -> Executors Framework is a high level API for managing threads and running tasks without manually creating
       and managing any thread objects.
    -> It has task submission through Runnable/ Callable and Task execution(using Thread pool).
    -> Runnable:
            - It represent a task that does not return any results. It also cannot check exceptions and has single method which is void run();
    -> Callable:
            - Callable represents a task that returns a result which is a generic result. it can throw checked exceptions.
              it also has only a single method that is v call() throws exception.
    -> Future:
            - It is an interface that represents the result of an asynchronized computation.
            - After submitting callable task, Future object is returned.
            - acts as a placeholder for the results.
 */
import java.util.concurrent.*;
public class Executorz {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(900); //sleeping thread by 900ms.
                return "Hello World";
            }
        };
        Future<String> hiii = pool.submit(task);
        System.out.println("Result is: "+hiii.get());
        pool.shutdown();

        //scheduling threads
        ScheduledExecutorService schedules = Executors.newScheduledThreadPool(2);
        schedules.scheduleAtFixedRate(()->{
            System.out.println("Task is being executed every 10 seconds.");
        },1,10,TimeUnit.SECONDS); // delay of 1 seconds and runs every 10 seconds and if the task takes
        // more than 10 seconds then the run is delayed until it finishes.

        schedules.schedule(()->{
            System.out.println("Task is being executed every 10 seconds.");
        },10,TimeUnit.SECONDS); // executes after a delay of 10 seconds
    }
}
