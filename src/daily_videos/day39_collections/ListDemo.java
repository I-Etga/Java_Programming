package daily_videos.day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>(); // polymorphism
        arrayList1.get(0);
        // As you remember, reference type decides which variables and methods can be accessible.
        // So .get(index)  obviously comes from parent class named List !!


        //However, arrayList and linkedList has DIFFERENT implementation of get method !!
        // You can take a look at ArrayList and LinkedList Class in order to see that different implementations

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array
        arrayList.get(0);
        // ArrayList uses implicitly array.
        // If we call the get() method, ArrayList's get method is faster than other .
        // Because it's using Array.

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class[Doubly linked List][Elements are linked to previous and next elements]
        // adding , inserting , removing is faster ==> add((), addAll(), remove(), removeAll(),removeIf(), retainAll()

        linkedList.get(0);
        // get method of LinkedList is not as fast as ArrayList.
        //Retrieving the element in ArrayList is also faster than LinkedList.

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        System.out.println("***** ***** *****");




    }


}
