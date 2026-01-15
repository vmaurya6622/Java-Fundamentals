package org.example.Java1017;
/*
    In java 11 new feature was added to check the string is it blank??
    They also added strip() method which is used to remove leading and trailing whitespaces along with Unicode characters.


 */
public class NewStringMethods {
    public static void main(String[] args) {
        //using isBlank() which checks whether the string is empty or contains only whitespace characters?
        System.out.println("".isBlank());
        System.out.println("   ".isBlank());
        System.out.println("abc".isBlank());

        // strip() is used to remove Unicode whitespace characters.
        String a = "    \u2001 abc   \u2005   ";
        System.out.println("Before using Strip: "+a);
        System.out.println("After using Strip :"+a.strip());

        // to repeat the string n number of times we can use repeat..
        var name = "vishal";
        System.out.println("Repeating name(7): ");
        System.out.println(name.repeat(7));
    }
}
