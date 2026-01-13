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
    public static void main(String[] args)
    {
        //IF and ELSE
        int age=15;
        if(age<18){
            System.out.println("You are too young to drive and vote");

        }else{
            System.out.println("You can drive as well as vote!");
        }
        //IF-ELSE-IF
        int score=41;
        if(score<33){
            System.out.println("You Failed");
        } else if (score>33 && score <70) {
            System.out.println("You are average");
        }else{
            System.out.println("you are a good student.");
        }
    }

}
