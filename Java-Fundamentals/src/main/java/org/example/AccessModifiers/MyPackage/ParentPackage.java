package org.example.AccessModifiers.MyPackage;

public class ParentPackage {
    public int PublicVar=12;
    private int PrivateVar=14;
    protected int protectedVar=11;
    int defaultvar=41;
    public void PrintThem(){
        System.out.println("Public Value "+PublicVar);
        System.out.println("Private Value "+PrivateVar);
        System.out.println("Protected Value "+protectedVar);
        System.out.println("Default Value "+defaultvar);
    } // this particular method can be called from anywhere like from other classes/ Packages too.
}