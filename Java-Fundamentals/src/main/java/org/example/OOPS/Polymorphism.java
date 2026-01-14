package org.example.OOPS;
/*
    -> polymorphism means having many forms and it means that an entity can take up many forms.
       In java, polymorphism allows the same method or object to behave differently based on the context.
       Types:
            - Method Overloading
            - Method Overriding
    -> Method Overloading or compile-time-polymorphism is where more than one method can share the same name with different
       signatures or parameters in a class. Return types may or may not be the same.
    -> Method Overriding or Run-time-Polymorphism is where method in the child class has the same name, return-type
       and parameters as in parent class. The child class just provides the implementation.

 */
class parent{
    public void func(){
        System.out.println("Parent.func()");
    }
    public  void func(int a){
        System.out.println("Parent.func() but with parameter a where a is: "+a);
    }
}
class child extends parent{
    @Override
    public void func(int a){
        System.out.println("child.func() with value of a being: "+a);
    }
}
public class Polymorphism {
    static void main() {
        parent p = new parent();
        child c = new child();
        parent polymorphismObj=new child();
        p.func();
        p.func(10);
        c.func(20);
        polymorphismObj.func(21);
    }
}
