package org.example;
/*
There are two types of data types:
-> Primitive and NON-primitive/ Reference datatypes
 **  Primitive DataTypes:
        -> Byte:  8-bit signed 2's complement int., [-128,127], 0 is default.
        -> Short: 16-bit signed 2's complement int. [-32768(-2^15),32767(2^15-1)]
        -> Int:   32-bit Signed 2's complement [-2^31,2^31-1]
        -> Long:  64-bit signed 2's complement [-2^63,2663-1] ; DEFAULT 0L
        -> Float: 32-bit IEEE 754 FP int. used to save memory, DEFAULT 0.0f
        -> double: double precision 64-bit IEEE 754 FP.; Default for decimals; DEFAULT 0.0d
        -> Boolean: represents only two values true or false, DEFAULT False.
        -> Char:   16-bit unicode char; min: '\u0000' or 0 ; max: '\uffff' or 65535 characters.
 **  Reference Datatypes:
        -> These are created using defined constructors of the classes; used to access objects; DEFAULT is NULL; Immutable
            EG. Worker worker = new Worker("Rohit")
        EG: String, Arrays, Classes, Interfaces, Enums, Wrapper Classes(Integer, Double etc.)
 **  Comparison: non primitive are slower, and accessed through referencing whereas primitive are fast and have direct access.

 */
import java.util.*;
class TempObj{
    String k="Vishal";
    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "TempObj{" + "k='" + k + '\'' + '}';
    }
}
public class DataTypes {
    public static void main(String[] args) {
        byte b=126;
        short s = 10000;
        int i = 1000000;
        long l = 100000000000L;
        float f = 166560.5455415545f;
        double d = -55599.991544541519888d;
        char c = 'k';
        boolean flag = true;
        String str = "Hello Sir!";
        int[] arr = {-18,2,3,4};
        TempObj newobj = new TempObj();  // default value defined in the class will be printed
        System.out.println(newobj.getK()); // we used the setter, so it modified the value.
        newobj.setK("Hari");    // "Hari" will now be printed.
        System.out.println(newobj.getK());
        System.out.println(newobj.toString());
        System.out.println("Byte: "+b);
        System.out.println("Short: "+s);
        System.out.println("Int: "+i);
        System.out.println("Long: "+l);
        System.out.println("Float: "+f);// two digits only after decimal
        System.out.println("Double: "+d);// upto 11 digits with rounded off.
        System.out.println("Char: "+c);
        System.out.println("Boolean: "+flag);
        System.out.println("Boolean: "+!flag); //with negation
        System.out.println("String: "+str);
        System.out.println("Array First Element: "+arr[0]);
        System.out.println("Object Reference: "+newobj);
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your input: ");
        String input= Sc.nextLine();
        System.out.println("You entered: "+input);
    }
}
