package org.example.exceptions;

/*
    Exception is an unexpected event that occurs during program execution and disrupts the normal flow of the program.
    E.g.  -> Divide by zero
          -> Accessing invalid array index
          -> Opening a file which doesn't exist.
    exceptions can be caught and handled using try-catch-finally blocks.
    E.g. IOException, SQLException, NullPointerException Errors:  OutOfMemoryError, StackOverflowError and VirtualMachineError.
    errors are serious problems that must be handled by the programmer whereas exceptions can be handled in the code.
 Object
    |___Throwable
            |--Error (serious problems)
            |--Exception (Recoverable Problems)

    exceptions are also classified as compile time(IOException, SQLException) and runtime exceptions(ArithmeticException, NullPointerException).
    Keywords:
        - try
        - catch
        - finally
        - throw
        - throws
 */
//import org.example.exceptions;
public class ExceptionsDemo {
    static void main() {
        // Basic try-catch
        try {
            int a = 10;
            int b = 0;
            int res = a / b;
            System.out.println("res=" + res);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        // Multiple/ Nested Try-Catch
        try{
            int[] arr= new int[3];
            System.out.println("Try accessing arr[5]="+arr[5]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds");
        }catch (Exception e){
            System.out.println("Exception");
        }
        //Finally Block
        try{
            int x=10/2;
            System.out.println("x: "+x);
        }finally {
            System.out.println("finally: this will always execute whether exception is thrown or not.");
        }
        // throw keyword usage
        System.out.println("Throw keyword usage");
        int age=15;
        if(age<17){
            throw new IllegalArgumentException("Age must be 18+ for a driving licence.");
        }
        // Throws Keyword usage only when we want our own custom exception
//      // when a method is not handling exception and is passing responsibility to the caller.


    }
}
