package org.example.Java1017;
/*
    -> comes from JAVA 17
    -> it allows us to combine type checking and casting in a single step which eliminates boilerplate code
       and making your programs more concise and readable.
    ->
*/
public class EnhancedInstanceOfDemo {
    static void main(String[] args) {
        Object tempobj= "Hello Vishal!";
        if(tempobj instanceof String){
            String str = (String) tempobj;
            System.out.println("String value of temp obj is: "+str);
        }else{
            System.out.println("Not a String!");
        }
        Object ob="Hello from Enhanced Instance";
        //Now i am using enhanced instance which allows to use the string without a typecast!
        if(ob instanceof String){
            System.out.println(ob);//
        }else{
            System.out.println("Not matched");
        }
        //In here, variable str is available only where condition evaluates to true and once
        // the block ends, the variable goes out of scope.
    }
}
