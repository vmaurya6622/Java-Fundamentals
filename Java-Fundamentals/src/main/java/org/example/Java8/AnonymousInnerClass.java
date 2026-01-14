package org.example.Java8;
/*
    -> Anonymous inner class is a java local class without a name and is declared, instantiated in a single expression.
    -> Allows to provide one time implementation of the interface or extending an existing class.
    -> it helps to get Conciseness; Locality; and SingleUse
 */
interface NGO{
    int funding();
    String getName();
}
public class AnonymousInnerClass {
    static void main() {
        NGO normal= new NGO() {
            @Override
            public int funding() {
                return 77;
            }

            @Override
            public String getName() {
                return "Suryavansham";
            }
        };
        System.out.println(normal.getName());
        System.out.println(normal.funding());
    }
}
