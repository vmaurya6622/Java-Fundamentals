package org.example.AccessModifiers;
/*
Access modifiers are used to control the visibility and accessibility of classes, variables, methods and constructors.
JAVA has its 4 types:
  -> Public:
        - Accessible anywhere.
        - Used for Api's and methods meant to be used for other classes.
  -> Private:
        - Accessible within the same class.
        - protects internal data and integrity.
  -> Protected:
        - Accessible within same package and in subclasses.
        - primarily used when inheritance is involved.
  -> default:
        - when no keyword is used. accessible only in same package.
        - mainly used for internal package-level logics.
 */
public class Usecases {
    // private
    private int privatevar = 10;
    private void privateMethod() {
        System.out.println("Private method Accessed from here!");
    }
    //default
    int a=11;
    void defaultMethod() {
        System.out.println("Default method Accessed from here!");
    }
    //protected
    protected int protectedvar = 21;
    protected void protectedMethod() {
        System.out.println("Protected method Accessed from here!");
    }
    //public
    public int publicvar = 31;
    public void publicMethod() {
        System.out.println("Public method Accessed from here!");
    }

    public static void main(String[] args) {
        Usecases obj=new Usecases();
        System.out.println("Private Value: "+obj.privatevar);
        obj.privateMethod();

        System.out.println("Default Value: "+obj.a);
        obj.defaultMethod();

        System.out.println("ProtectedValue: "+obj.protectedvar);
        obj.protectedMethod();

        System.out.println("Public Value: "+obj.publicvar);
        obj.publicMethod();
    }
}
// for simplicity of the code i have just shown initialisation i can also show how these ACCESS MODIFIERS work if you want.