package org.example;

/*
String v/s StringBuilder
 -> strings are objects that are sequence of characters;
    Ways to represent: String s = new String("Hello");
                   or, String s = "Shreya";

    In java.lang.string there are 3 types of classes which implements serializable, comparable and charsequence.
    classes which implement CharSequence are String, StringBuilder, StringBuffer.
    So, in java we can create strings using StringBuilder, StringBuffer and String classes.
    String Class is immutable i.e. any modification creates new objects while others i.e. StringBuilder(Faster + Thread Unsafe + Single Threaded)
    and StringBuffer(Thread safe + Multithreaded + slower) are mutable.

 -> Now, lets talk about string pools which is a specific region/ area in the heap memory. JVM stores only one copy
    of each unique literal. If same literal is reused, JVM returns the same reference. it improves memory and performance.


 */
public class StringsDemo {

    static void main() {
        //Initialisation using literals
        String s1="Hello";
        String s2="Hello";
        System.out.println("s1 == s2?? : "+(s1==s2)); // true because both refer to the same object in spring pool.
        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println("s3 == s4?? : "+(s3==s4)); // false because both are different objects in heap.
        System.out.println("\nValue Comparison: ");
        System.out.println("s1.equals(s2)?? : "+(s1.equals(s2)));
        System.out.println("s3.equals(s4)?? : "+(s3.equals(s4)));

        System.out.println("\nCheck Immutability!");
        String original="java";
        original.concat("is object oriented."); // this creates a new object that's why it is ignored.
        System.out.println("After concat without reference: "+original);
        original=original.concat("but not sure!!"); //via assignment operators
        System.out.println("After concat with reference: "+original);

        System.out.println("Java String Fundamentals: ");

        String test="Ciena is a CN based company.";
        System.out.println("Length: "+test.length());
        System.out.println("Trimmed: "+test.trim());
        System.out.println("UpperCase: "+test.toUpperCase());
        System.out.println("LowerCase: "+test.toLowerCase());
        System.out.println("Starts with 'A'?: "+test.startsWith("A"));// false as it starts with 'C'
        System.out.println("char at idx 3: "+test.charAt(3));

        System.out.println("StringBuilder!!");
        StringBuilder sb  =  new StringBuilder("Hello");
        sb.append("world");
        sb.append("!");
        System.out.println("StringBuilder Result: "+sb);

        System.out.println("ThreadSafe StringBuffer");
        StringBuffer sbf=new StringBuffer("Helloo");
        sbf.append("meee");
        System.out.println("StringBuffer Result: "+sbf);
        // Initialisation using new keyword
//        System.out.println("hel");
    }
}
