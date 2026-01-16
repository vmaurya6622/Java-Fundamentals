package org.example.streamsAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
     -> Intermediate Ops: returns a lazy stream e.g. filter, map,sorted, district, limit, skip.
     -> Terminal Ops: produce a result/side-effect e.g. collect, foreach,reduce,reduce, count.

     Important:
            - we use filter and collect to realise results.
            - we use map and with methods for reference.
            - we use sorted with natural and custom comparator.
            - we use few terminal operations like collect/toList, forEach, reduce
 */
public class StreamsOps {
    static void main() {
        List<String> names = Arrays.asList("Akshita", "Ram", "Shyam", "Ghanshyam");
        List<String> IsstartsWithA = names.stream()
                                            .filter(s -> s.startsWith("A"))
                                            .collect(Collectors.toList());
        System.out.println("Checking if it starts with A: " + IsstartsWithA);

        // creating map using lambda and method reference.
        List<String> upper1 = names.stream()
                                    .map(s -> s.toUpperCase())
                                    .collect(Collectors.toList());
        List<String> upper2 = names.stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());
        System.out.println("Upper (lambda) function: " + upper1);
        System.out.println("Upper using method reference: " + upper2);

        // sorted: natural order vs. custom comparator (by length ascending)
        List<String> natural = names.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
        List<String> byLength = names.stream()
                                        .sorted(Comparator.comparingInt(String::length))
                                        .collect(Collectors.toList());
        System.out.println("Sorted (natural) without any custom comparator: " + natural);
        System.out.println("Sorted (by length) using comparator: " + byLength);

        // More terminal operations
        List<Integer> nums = Arrays.asList(1, 2, 3);

        // collect/toList (Java 16+ has .toList())
        List<Integer> skipped = nums.stream().skip(1).collect(Collectors.toList());
        List<Integer> skipped2 = nums.stream().skip(1).toList();
        System.out.println("Skipped (collect): " + skipped);
        System.out.println("Skipped (toList): " + skipped2);

        // using forEach
        System.out.print("forEach: ");
        nums.stream().forEach(x -> System.out.print(x + " "));
        System.out.println(); // Just to print the nums array.

        // using reduce (sum)
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Sum (reduce): " + sum); // used to print the sum of the integers.

    }
}
