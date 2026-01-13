package org.example.AccessModifiers.MyPackage;
//import MyPackage.ParentPackage;
public class SubPackage extends ParentPackage {
    public void PrintSubPackage() {
        System.out.println("Trying to access from subclass in same package");
        System.out.println("Public Value "+PublicVar);
//        System.out.println("Private Value "+PrivateVar); // this will give an error we can use try - catch to check this.
        System.out.println("Protected Value "+protectedVar);
        System.out.println("Default Value "+defaultvar);
    }

    static void main() {
        SubPackage p = new SubPackage();
        p.PrintSubPackage();
    }
}
