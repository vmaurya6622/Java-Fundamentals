package org.example.streamsAPI;
/*
    It showcases four core Java functional interfaces—Consumer, Supplier, Predicate, and Functions.
 */
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerSupplier {
    static void main() {
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(11);

        Supplier<String > supplier = () -> "Hello"; //this functional interface only gives and does not takes.
        System.out.println(supplier.get());

        Predicate<Integer> isOdd= x -> x%2==1;
        Function<Integer,Integer> function = x -> x*5;
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Supplier<Integer>supplier1=()->100;
        System.out.println(supplier1.get());
    }
}
