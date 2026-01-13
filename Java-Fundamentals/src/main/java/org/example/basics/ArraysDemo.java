package org.example.basics;

import java.util.Arrays;

/*
     -> Array is an object used to store multiple values of same datatype in a contiguous memory structure.
     Key Points:
     -> fixed size; indexing starts from 0; dafault values automatically assigned;
     -> faster access to memory using indices.
 */
public class ArraysDemo {
    static void changeArray(int[]arr){
        for(int i=0;i< arr.length;i++){
            arr[i]=arr[i]*2; // i am incrementing every arr element by twice.
        }
    }

    static void main() {
        int [] num={14,85,11,10,21};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(num));
        System.out.println();

        System.out.println("Accessing Elements:");
        System.out.println("First Element: "+ num[0]);
        System.out.println("Last Element: "+num[num.length-1]);

        System.out.println("Print all elements: ");
        for(int i=0;i<num.length;i++) System.out.println("Element @ idx "+i+" is: "+num[i]);

        System.out.println("\nNow Sorting: ");
        Arrays.sort(num);
        for(int i=0;i<num.length;i++) System.out.println("After Sorting Element @ idx "+i+" is: "+num[i]);

        System.out.println("Call by value V/s Call by reference: ");
        System.out.println();

        System.out.println("Before changeArray() call: "+Arrays.toString(num));
        changeArray(num);
        System.out.println("After changeArray() call: "+Arrays.toString(num));

    }
}
