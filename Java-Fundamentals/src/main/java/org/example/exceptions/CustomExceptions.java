package org.example.exceptions;
import java.util.Scanner;
/*
Exception class has following methods:
    -> String toString()
    -> void printStackTrace()
    -> String getMessage()
 */

class ManMadeException extends Exception{
    @Override
    public String toString(){
        return super.toString()+" i am super() message";

    }
//    @Override
    public String PrintMessage() {
        return "Hi this is custom exception! enter number >8";
    }

//    public ManMadeException(String message){
//        super(message);
//    }
}
public class CustomExceptions {
    static void main() {
        System.out.println("Enter input number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number<9){
            try{
                throw new ManMadeException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
