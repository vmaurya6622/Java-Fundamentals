package org.example.multithreading;
import static java.lang.Thread.sleep;

/*
      -> Deadlocks occurs when two or more threads fight for accessing a variable or wait for each other
         to release resources and none of them proceeds.
      -> program get stuck forever.
      -> Conditions to Deadlock:
              - Mutual Exclusion
              - Hold and Wait
              - No Preemption
              - Circular Wait
 */

public class DeadLocksDemo {
    static void main() {
        String LockA = "LockA";
        String LockB = "LockB";

        Thread t1 = new Thread(() -> {
            System.out.println("T1 tyring to reserve LockA");
            synchronized (LockA) {
                System.out.println("T1 reserved LockA");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T1 trying to reserve LockB");
                synchronized (LockB) {
                    System.out.println("T1 reserved LockB");
                    System.out.println("T1 has both LockA and LockB");
                }

                System.out.println("T1 released LockB");
            }

            System.out.println("T1 released LockA");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("T2 tyring to reserve LockB");
            synchronized (LockB) {
                System.out.println("T2 reserved LockB");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T2 trying to reserve LockA");
                synchronized (LockA) {
                    System.out.println("T2 reserved LockA");
                    System.out.println("T2 has both LockA and LockB");
                }
                System.out.println("T2 released LockA");
            }
            System.out.println("T2 released LockB");
        });
        t1.start();
        t2.start();
        System.out.println("Code is ended.."); // this will not be printed due to deadlock situation.
    }
}