package org.example.streamsAPI;

import java.util.function.Function;

/*
     -> Function<T, R>: transforms T → R and it Uses apply() to execute.
     -> identity() is useful as a default no-op in pipelines which returns input unchanged.
 */
public class FunctionsInJava {
    static void main() {
        Function<Integer,Integer> twiceit= x->x*2;
        Function<Integer,Integer> incrementit= x->++x;
        System.out.println("Using twiceit: "+twiceit.apply(12));
        System.out.println("Using incrementit: "+incrementit.apply(12));

        // we can use andThen to define a procedure of functions from where we have to start and where to end.
        System.out.println("After using andThen: "+twiceit.andThen(incrementit).apply(12));

        //defining static methods
        Function<Object,Object> identity = Function.identity();
        identity.apply(22);
    }
}
