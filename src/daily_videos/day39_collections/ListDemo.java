package daily_videos.day39_collections;

import java.util.*;


public class ListDemo {

    public static void main(String[] args) {

        System.out.println("***** Array List *****");

        List<Integer> arrayList1 = new ArrayList<>(); // polymorphism
        //List has index number, allows duplicates [1,1,4,2,4,1...]

        // arrayList1.get(0);
        // As you remember, reference type decides which variables and methods can be accessible.
        // So .get(index)  obviously comes from parent class named List !!


        //However, arrayList and linkedList has DIFFERENT implementation of get method !!
        // You can take a look at ArrayList and LinkedList Class in order to see that different implementations

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array
        // ArrayList uses implicitly array.
        // If we call the get() method, ArrayList's get method is faster than other .
        // Because it's using Array.

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        System.out.println(arrayList.get(0));


        System.out.println("***** Linked List *****");
        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class[Doubly linked List][Elements are linked to previous and next elements]
        // adding , inserting , removing is faster ==> add((), addAll(), remove(), removeAll(),removeIf(), retainAll()


        // get method of LinkedList is not as fast as ArrayList.
        //Retrieving the element in ArrayList is also faster than LinkedList.

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        System.out.println(linkedList.get(0));

        System.out.println("***** Vector *****");

        Vector<Integer> vector = new Vector<>();
        // Class methods and objects are synchronized [thread safety]!!
        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println(vector.get(0));

        System.out.println("***** Stack *****");
        // Stack is child class of Vector Class
        // Class, methods and objects are synchronized [thread safety]!!

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop(); // Pop methods returns and then removes the last element of Stack !!

        System.out.println(stack);

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);


        /*1. List (I): Has Index Number, Allows Duplicate

                1.1 ArrayList: Array based class
                               Accessing/searching the elements are faster

                1.2 LinkedList: Node based class (doubly linked list)
                                Insertion & deletion of elements are faster

                1.3 Vector: Same as ArrayList but synchronized
                            Is Synchronized ==> Thread-safety

                1.3.1 Stack: Same as ArrayList but synchronized
                            Last-In-First-Out (LIFO) ===> pop()

         */
    }


}
