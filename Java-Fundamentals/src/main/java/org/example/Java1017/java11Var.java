package org.example.Java1017;
/*
    -> var is a reserved type name that is introduced first in java10. It allows us to declare
       local variable without specifying their type.
    -> var can be used for local variables  only and cannot be used for instance variables, method parameters.
    -> In later versions, e.g. java11 the scope for var is extended to lambda expressions which allows
       you to declare the type of lambda parameters using var.
    -> var is particularly used when annotations are needed on lambda functions.
 */
import java.util.*;
import java.util.stream.Collectors;

public class java11Var{
    static void main() {
        var carname="BMW";
        var buidYear=2022;
        System.out.println("carname is: "+carname+" and its build year is: "+buidYear);
        List<String> ListNames = List.of("bmw","audi","RollsRoyce","Ferrari");

        //using normal lambda function
        List<String> convertedUpperCaseNames = ListNames.stream().map((String name)->name.toUpperCase()).collect(Collectors.toList());
        System.out.println("converted upper names is: "+convertedUpperCaseNames);

        // lambda using 'var'
        List<String> ConvertUpperCaseuUsingVar = ListNames.stream().map((var name)->name.toUpperCase()).collect(Collectors.toList());
        System.out.println("converted upper names using var: "+ConvertUpperCaseuUsingVar);
    }
}