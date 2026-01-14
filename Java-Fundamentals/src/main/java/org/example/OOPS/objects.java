package org.example.OOPS;
/*
    -> Object
         - An object is a basic as well as real life entities of OOPs.
         it mainly consists of:
                - State: represents attributes of an object and also reflects the properties of the object
                - Behaviour: represented by the methods of the objects and reflects the response of the object to other objects.
                - Identity: It's a unique name given to an object that enables it to interact with other objects.
                - Method: method is like a function which performs certain tasks and return the result to the caller.

 */
public class objects {
    private String name;
    private float age;
    public objects(String name, float age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public float age() {return age;}
    public void setName(String name) {this.name = name;}
    public void setAge(float age) {this.age = age;}
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    static void main() {
        objects a = new objects("A", 30);
        System.out.println("Printing Name: "+a.getName());
        System.out.println("Printing Age: "+a.age());
        a.setAge(10);
        System.out.println("Printing Age after using setAge: "+a.age());
        System.out.println("printing Object Information: ");
        a.showDetails();
    }
}
