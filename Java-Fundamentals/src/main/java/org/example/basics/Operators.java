package org.example.basics;

import java.util.function.UnaryOperator;

/*
Operators are special symbols to perform operations on variables and constants.
Classifications:
    -> Arithmetic + - * /
    -> Unary + - ++ -- !
    -> Relational == != > < >= <=
    -> Logical && || !
    -> Assignment = += -= *= /= %=
    -> Bitwise & | ^ ~ << >> >>>
    -> Ternary ? : (used as conditional operator)
 */
public class Operators {
    public static void main(String[] args) {
        int a=20;
        int b=17;
        System.out.println("Arithmetic");
        System.out.println("a+b"+(a+b));
        System.out.println("a-b"+(a-b));
        System.out.println("a*b"+(a*b));
        System.out.println("a%b"+(a%b));
        System.out.println("a/b"+(a/b)); // Note here cannot divide by zero exception
        System.out.println();

        System.out.println("UnaryOperators");
        System.out.println("a = "+a);
        System.out.println("++a = "+(++a));
        System.out.println("a++ = "+(a++));
        System.out.println("--a = "+(--a));
        System.out.println("!true = "+(!true));
        System.out.println();

        System.out.println("RelationalOperators");
        System.out.println("a==b: "+(a==b));
        System.out.println("a!=b: "+(a!=b));
        System.out.println("a>b: "+(a>b));
        System.out.println("a<b: "+(a<b));
        System.out.println("a>=b: "+(a>=b));
        System.out.println("a<=b: "+(a<=b));
        System.out.println();

        System.out.println("LogicalOperators");
        boolean ismale=false;
        boolean issmiling=true;
        System.out.println("ismale and smiling? : "+ (ismale && issmiling));
        System.out.println("ismale OR smiling? : "+ (ismale || issmiling));
        System.out.println("!ismale? : "+(!ismale));
        System.out.println();

        System.out.println("Assignment Operators");
        int val=10;
        val+=5;
        System.out.println("value +=5 -> "+val);
        val-=2;
        System.out.println("value -=2 -> "+val);
        val*=6;
        System.out.println("value *=6 -> "+val);
        val/=4;
        System.out.println("value /=4 -> "+val);
        val%=2;
        System.out.println("value %=2 -> "+val);
        System.out.println();

        System.out.println("BitwiseOperators");
        int m=7;
        int n=3;
        System.out.println("m & n = "+(m&n));
        System.out.println("m ^ n = "+(m^n));
        System.out.println("m | n = "+(m|n));
        System.out.println("~m = "+(~m));
        System.out.println("m<<1 = "+(m<<1));
        System.out.println("m>>2 = "+(m>>2));
        System.out.println();

        System.out.println("TernaryOperators");
        int value=30;
        String str = (value>20) ? "value is more than 20" : "value is less than 20";
        System.out.println(str);
    }
}
