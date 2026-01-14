package org.example.Java8;
//Functional Interfaces
/*
    Interface can have only 1 abstract method but may have any number of defaults or static methods
    this enables the use of lambda expressions to provide implementation of abstract method in clean and concise way.
    @FunctionalInterface is used to send compiler a message about it.
 */
@FunctionalInterface
interface School{
    abstract String getName();
}
class teacher implements School{
    @Override
    public String getName() {
        return "Madhumita";
    }
}
public class FunctionalInterfaces {
    static void main() {
        School s = new teacher();
        System.out.println(s.getName());

        //Now using Lambda Expressions and Functional Interfaces
        School s2=()->{
            return "Madhumita with lambda";
        };
        System.out.println(s2.getName());

    }
}
