package org.example.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
     -> :: double colon is the method reference operator which lets us to pass and existing method or constructor.
     -> It's a shorthand for lambda which improves readability and avoids confusions.
     Types are:
            - Reference to static method:
            - Reference to instance method of particular object:
            - Reference to instance method of an arbitrary object:
            - constructor reference.
 */

class Person {
    private final String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class RemainingStreams {
    static void main() {
        List<String> raw = Arrays.asList("Asha", "Joe Biden");
        List<Person>people = raw.stream().map(Person::new).collect(Collectors.toList());
        people.stream().map(Person::getName).forEach(System.out::println);
    }
}
