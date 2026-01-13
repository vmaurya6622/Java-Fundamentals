package org.example.collections;

import java.util.*;

/*
Collections Framework in java
it is used for storing, manipulating, and processing a group of objects.
it provides:
    -> Interfaces; Implementations; Algorithms
    -> collections provide dynamic resizing, Rich API's, Better Abstraction between classes and Type safety using Generics.
    Core interfaces are |
                        |--List
                        |--Set
                        |--Queue
    List Interface:
        -- Ordered Collection
        -- Allows duplicate elements
        -- Easy Access via index
        -- implementation are ArrayList; LinkedList; Vector
    Set Interface:
        -- no duplicate elements and no index based access;
        -- Implementation includes HashSet; LikedHashSet; TreeSet
    Map Interface:
        -- stores data in key-value pairs where keys are unique.
        -- Implementation includes HashMap; LinkedHashMap; TreeMap
we should prefer interfaces over implementations and use HashMap unless ordering is mandatory.

 */
public class ListSetMap {
    static void main() {
        //LIST
        // ->ArrayList
        System.out.println("LIST::");
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("Kaise Ho?");
        System.out.println("Printing List elements: "+list);
        System.out.println("Printing 1st element of the list(0-based indexing): "+list.get(0));
        list.set(1,"NOOOO");
        list.remove(2);// element at idx 2 will be deleted.
        System.out.println("Printing again after using list.set(): "+list);

        // Linked List
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addFirst(2);
        l1.addFirst(5);
        l1.addFirst(7);
        l1.addFirst(9);
        l1.add(1,44);
        System.out.println("Printing Linked List: "+l1);
        l1.removeLast();
        System.out.println("Printing Linked List after l1.removeLast(): "+l1);
        System.out.println("Printing Linked List: "+l1);

        //Vector
        Vector<String> vec = new Vector<>();
        vec.add("henry! ");
        vec.add("wash ");
        vec.add("the car");
        System.out.println("Printing Vector: "+vec);
        System.out.println("Element at idx 1: "+vec.get(1));
        //modify
        vec.set(1,"crush");
        System.out.println("Printing after modifying: "+vec);
        //remove
        vec.remove(2);
        System.out.println("Printing After Removal: "+vec);
        System.out.println("printing the capacity of the vector: "+vec.capacity());

//        Set
//        -> HashSet Faster and no order
        HashSet<String> h = new HashSet<>();
        h.add("marry");
        h.add("on");
        h.add("a");
        h.add("cross");
        System.out.println("Printing HashSet: "+h);
        h.remove("marry");
        System.out.println("Printing HashSet After Removing: "+h);
//      TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("marry");
        ts.add("on");
        ts.add("a");
        ts.add("cross");
        System.out.println("Printing TreeSet: "+ts);
        ts.remove("marry");
        System.out.println("Printing TreeSet After Removing: "+ts);
        System.out.println("First Element: "+ts.first());
        System.out.println("Last Element: "+ts.last());

//      Maps
//      HashMap
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,11);
        hm.put(2,22);
        hm.put(3,33);
        System.out.println("Printing HashMap: "+hm);
        System.out.println("Value at key 2: "+hm.get(2));
        hm.remove(1);
        System.out.println("Printing HashMap After Removing: "+hm);

    }
}
