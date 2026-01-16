package org.example.streamsAPI;

import java.util.function.Predicate;

/*
      -> it represents a boolean condition on T.
      -> It exposes a single method; boolean test (T t)

 */
public class Predicates {
    static void main() {
        Predicate<Integer> isOdd = i -> i % 2 == 1;
        System.out.println("Testing predicate at 4: "+isOdd.test(4));
        System.out.println("Testing Predicate at 3: "+isOdd.test(3));

        //Another example:
        Predicate<String> IsstartsWithA = s -> s.startsWith("A");
        System.out.println("Testing that Apple starts with A?: "+IsstartsWithA.test("Apple")); // true
        System.out.println("ITesting that Apple starts with A?: "+IsstartsWithA.test("banana"));

    }
}
