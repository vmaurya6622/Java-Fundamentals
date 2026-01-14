package org.example.Java8;
/*
static methods oin java are belongs to the class itself rather than any specific object
Hence they can be called without making any instance.
they are good in where operations are not tied to object state and often serve as helper or utility functions.
 */
interface X{
    static void say(){
        System.out.println("Hello from x");
    }
}
class Y implements X{
    void say(){
        System.out.println("Hello from y");
    }
}
public class StaticMethods {
    static void main() {
        X.say();
    }
}
