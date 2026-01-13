package org.example.ControlFlow;
/*
 Control flow the direction with which the statements in a program are executed. By default, java executes statements sequentially
 i.e. top to bottom.
 Types:
     -> Decision-Making:
            - if
            - if-else
            - if-else-if
            - switch
     -> Looping statements:
            - for
            - while
            - do-while
            - enhanced for-each loop
     -> Branching statements:
            - break
            - continue
            - return
 */
public class CotrolStatements {
    public static void main(String[] args) {
        //IF and ELSE
        int age = 15;
        if (age < 18) {
            System.out.println("You are too young to drive and vote");

        } else {
            System.out.println("You can drive as well as vote!");
        }
        //IF-ELSE-IF
        int score = 41;
        if (score < 33) {
            System.out.println("You Failed");
        } else if (score > 33 && score < 70) {
            System.out.println("You are average");
        } else {
            System.out.println("you are a good student.");
        }
        //switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        //FOR Loop
        for (int i = 0; i <= 5; i++) {
            System.out.println("for loop i = " + i);
        }
        //while loop
        int i = 4;
        while (i == 0) {
            System.out.println("while loop i = " + i);
            i--;
        }
        // Do-While Loop
        int num = 1;
        do {
            System.out.println("Do-while is executing...\n ");
            num++;
        } while (num < 5);
        // Enhanced For-loop (FOR-EACH)
        int[] arr = {10, 11, 12, 13, 14, 15};
        for (int value : arr) {
            System.out.println("For-Each running value : " + value);
        }

        // Break Statement
        for (int ii = 1; ii <= 5; ii++) {
            if (ii == 3) {
                break;
                //System.out.println("this will not be printed");
            }
            System.out.println("Break check running value : " + ii);
        }
        //similarly "continue" statements doesn't hold the code they just allow the code to run.
        // Return Statements
        System.out.println("Square of 4 is? : " + square(4));
    }
    static int square(int o) {
        return o * o;
    }
}
