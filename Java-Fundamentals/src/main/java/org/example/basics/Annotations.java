package org.example.basics;
/*
    Annotations in java provide metadata for the code. It helps the compiler to know what is going to be done.
    Annotations often start with the symbol @ and written above classes, Methods, Fields and Parameters.

    @Override: used to when a method overrides a superclass method.
    @Deprecated: it is used to mark class, method or field as deprecated.
    @SuppressWarning: indicates the compiler to suppress compiler warnings for the annotated code.
 */
class calculator{
    @Deprecated
    public int add(int a,int b){
        return a+b;
    }
    public int addNew(int a,int b){
        return a*b; //just for checking
    }
}

public class Annotations {
    @SuppressWarnings("deprecation")
    static void main() {
        calculator c=new calculator();
        int res =  c.add(9,2);
        System.out.println("calculator result is: "+res);
    }
}
