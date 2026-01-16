package org.example.streamsAPI;
/*
    -> streams were introduced in java-8, the stream API is primarily used to process collection of objects.
    -> A stream in java is a sequence to object tat supports various methods that can be pipelined to produce result.
    -> Syntax: Stream<T> stream;
    -> Features:
            - Not a dataStructure; it just takes input from collections or I/O channels.
            - Streams do not alter original data;
            - Intermediate operations are lazy and return another stream.
            - Terminal operation ends the stream and gives the final result;
     -> Types of Operations on Streams:
            - Intermediate Operations; Methods are chained together; Transform a stream to another; enables filtering;
            - Terminal Operations; Operations are return result; Operations are not processed further and return a final result value.

*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasics {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int cnt = 0;
        for(Integer i : numbers) {
            if(i % 2 == 0) {
                cnt++;
            }
        }
        System.out.println("Evens (loop): " + cnt);
        long evenCount = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .count();
        System.out.println("Evens (stream): " + evenCount);
        String[] arr = {"a", "b", "c"};
        Stream<String> s1 = Arrays.stream(arr);
        Stream<String> s2 = Stream.of("x", "y");
        Stream<Integer> s3 = Stream.generate(() -> 1)
                                    .limit(5);
        System.out.println("s1 size: " + s1.count());
        System.out.println("s2 size: " + s2.count());
        System.out.println("s3 size: " + s3.count());
    }
}
