package org.example.multithreading;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

/*
     It is an extension to future, where it provides methods to handle asynchronous programming
     (it means tasks run independently without blocking the main thread) with nonblocking and
      chaining operations. it is non-blocking.
*/

public class CompletableFutureDemo {
    static void main(String[] args) {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->{
            String str1 = "Vishal";
            String str2 = "Maurya";
            String str3 = Arrays.toString(str1.split("s"));
            return str3+str2;
        });
        String result = cf.join();
        System.out.println("Output After running this code is : "+result);
    }
}
