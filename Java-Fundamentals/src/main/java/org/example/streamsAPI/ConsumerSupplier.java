package org.example.streamsAPI;

import java.util.function.Consumer;

public class ConsumerSupplier {
    static void main() {
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(11);
        
    }
}
