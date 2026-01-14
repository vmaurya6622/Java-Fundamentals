package org.example.Java8;

import java.util.*;

import static java.util.Arrays.asList;

/*
    -> Key features for java-8 includes
            - Lambda Expressions
            - Functional Interfaces
            - Stream API
            - Optional
            - Date and Time API
            - Method Preferences

 */
public class java8 {
    static void main() {
         /*
            Lambda Function:
                Animal cat=() -> {
                    return "She is not a cat";
                }
                it is equivalent to:
                Animal cat = new Animal(){
                    @Override
                    public String getName(){
                        return "She is not a cat";
                    }
                };
                In here the compiler creates a new anonymous class implementing Animal where variable "cat" holds a reference to this
                anonymous class object.
         */
         List<String> lis = new ArrayList<>(Arrays.asList("Hello", "World","blast by trump"));
         Collections.sort(lis, new Comparator<String>() {
             @Override
             public int compare(String o1, String o2) {
                 return Integer.compare(o1.length(), o2.length());
             }
         });
         List<String> lis2 =  new ArrayList<>(Arrays.asList("Hello", "World","blast by trump"));
         lis2.sort((s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(lis);
        /*
        Advantages includes: Easier to understand and read; less overhead and functional style.
         */


    }
}
