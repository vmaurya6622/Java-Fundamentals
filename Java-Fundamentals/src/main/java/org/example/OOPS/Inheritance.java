package org.example.OOPS;
/*
    -> It is a mechanism which allows one class to inherit the features (fields and methods) of another class
    -> it is achieved by using "extends" keyword.
    -> it is also known for is-a relationship.
    E.g. cat, dog, cow can be classified under Animal base class.

    -> SuperClass: class whose features are inherited.
    -> SubClass:   class that inherits other class. also regarded as derived class.
        `          subclass can add its own fields and methods  in addition to hte superclass fields and methods.
 */
class father{
    void smile(){
        System.out.println("Father is smiling");
    }
    void kick(){
        System.out.println("Father is kicking");
    }
}
class son extends father{
    void play(){
        System.out.println("Son is playing");
    }
}
public class Inheritance {
    static void main() {
        son s = new son();
        // Inherited methods from the parent i.e. parent characteristics
        s.smile();
        s.kick();
        // child class method i.e. child's characteristics
        s.play();
    }
}
