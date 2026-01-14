package org.example.OOPS;
/*
    It's a process of wrapping data nad methods into a single unit, typically a class.
    process that binds code and data together as well as it helps to ensure the code privacy
    integrity.
    -> In encapsulation, variables and data in a class is hidden from any other class and can be accessed
        only through any member function of the class in which it is declared.
    -> it can be achieved by declaring all the variables in a class as private and writing public methods in
        the class to set and get the values of the variable.
 */
public class Encapsulation {
    private int id;
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }

    static void main() {
        Encapsulation obj = new Encapsulation();
        obj.setId(11514);
        obj.setName("Vishal Maurya");
        System.out.println("Printing Name: "+obj.getName());
        System.out.println("Printing Id: "+obj.getId());
    }
}
