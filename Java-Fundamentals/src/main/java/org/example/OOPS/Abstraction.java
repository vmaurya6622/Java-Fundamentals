package org.example.OOPS;
/*
    -> Abstraction is a process of hiding the implementation details and showing the essentials details or features
       that are relevant to the users.
       Abstraction is achieved by interfaces and abstract classes. Additionally, we can get a full abstraction using interfaces.
 */
abstract class Animal {
    abstract void eat();
    abstract void sleep();
    void play(){
        System.out.println("Animal is playing");
    }
}
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("cute cat is eating");
    }
    @Override
    void sleep() {
        System.out.println("cat is sleeping");
    }
}
public class Abstraction {
    static void main() {
        Animal a = new Cat();
        a.eat();
        a.sleep();
        a.play();
    }
}
