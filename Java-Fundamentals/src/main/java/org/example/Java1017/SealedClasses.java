package org.example.Java1017;
/*
    -> Introduced in java17. it is when I want strict control over the inheritance hierarchy.
    -> Sealed classes come in between abstract class and final class which is someway inherited or not.
    -> It allows to create a restricted class hierarchy where the set of subclasses are explicitly
        and controlled.
    -> subclasses must define how they are related to the sealed classes
    -> A subclass of a sealed class must declare one of these:
            - final - nobody can extend this class.
            - sealed - Only specified classes can inherit.
            - non-sealed - Free for inheritance for all.
 */
sealed class ciena implements Cloneable permits A,B,C{
    void greet(){
        System.out.println("Hello From ciena Company.");
    }
}
final class A extends ciena{

}
sealed class B extends ciena permits D{

}
non-sealed class C extends ciena{

}
final class D extends B{

}
class E extends C{

}
public class SealedClasses {
    static void main() {
        E e = new E();
        e.greet();
    }

}
