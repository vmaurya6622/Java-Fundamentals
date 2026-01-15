package org.example.Java1017;
/*
    -> Introduced in Java17, pattern matching is a way of describing a structure or behaviour in data so we can check for it.
    -> so, if the code recognises something like the parameter given then do the specified task.

    Types:
        -> Type Patter:
            - Checks if the parameter is equal to what you want and gives access to iot directly.
        -> Value Pattern:
            - Matches specific values and patterns in the string or value.
 */

public class PatterMatchingSwitch {
    public static String describe(Object obj1){
        //using switch-case to describe the type of the object.
        return switch(obj1){
            case Integer i -> "It's an Integer value: "+i;
            case String s -> "It's a String value: "+s+"\"";
            case null -> "It's a null value";
            default -> "Unknown type!";
        };
    }
    static void main(String[] args) {
        Object object = "Hello World";

        //using instanceof to do string matching
        if(object instanceof String s){
            System.out.println("String Value matched and the string is: "+s);
        }else{
            System.out.println("Not a String!");
        }
        System.out.println(describe(445));
        System.out.println(describe("Hello"));
        System.out.println(describe(null));
        System.out.println(describe(2.71));
    }
}
