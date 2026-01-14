package org.example.Java8;
/*

 */
interface Company{
    default void Name(){
        System.out.println("BluePlanet");
    }
}
class branch implements Company{
}
class subsidiary implements Company{
    @Override
    public void Name(){
        System.out.println("Subsidiary company says hello");
    }
}

interface A{
    default void services(){
        System.out.println("Networking and Infrastructure of A");
    }
}
interface B{
    default void services(){
        System.out.println("Networking and Infrastructure of B");
    }
}
class employee implements A,B{
    @Override
    public void services(){
        System.out.println("Employee of the company says hello");
    }
}
public class DefaultMethods {
    static void main() {
        branch b= new branch();
        b.Name();
        subsidiary s= new subsidiary();
        s.Name();
        employee e= new employee();
        e.services();
    }
}
