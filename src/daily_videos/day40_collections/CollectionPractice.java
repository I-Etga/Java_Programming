package daily_videos.day40_collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 400, 600, 800, 700, 100));


        System.out.println(collection); // [100, 100, 200, 100, 200, 400, 600, 800, 700, 100]

        // get() method is not common method of Collection !!It's a method of List.
        // Reference type: Collection and obj. type: ArrayList. Reference type decides what is accessible.
        // So we can't access get method unless we use downcasting !!

        System.out.println(((ArrayList<Integer>) collection).get(2));

        //System.out.println(((Stack)collection).pop() );
        /*
        We get "ClassCastException". But why?
        Because this reference type referencing to obj. type of ArrayList.
        There is no IS A relationship between Stack and Arraylist.
         */


        System.out.println("***** *****");
        //Collection is parent of Set and can reference to HastSet/LinkedSet/TreeSet.
        // Which set should I use then ? It's depends on the scenario.

        Collection<Integer> collection1 = new TreeSet<>(); // It keeps sorted order.I need elements sorted, then I should use it.

        Collection<Integer> collection2 = new LinkedList<>(); // It keeps the insertion(add) order.If I want to keep the insertion order, I use it.

        Collection<Integer> collection3 = new HashSet<>();// If the order does not matter at all, I can use HashSet.
        collection3.addAll(Arrays.asList(100, 200, 100, 200, 400, 600, 800, 700, 100));

        System.out.println(collection3);// [400, 800, 100, 200, 600, 700][no specific order/ no duplicates]

        //System.out.println(((ArrayList)collection3).get(4));--> we can't downcast HashSet to ArrayList. [No Relationship]

        // But we have an alternative way !! Collection subclasses has one default constructor and one with collection parameter constructor.
        // So we can convert one collection type to another through constructor !!
        System.out.println(new ArrayList<>(collection3).get(4));


    }
}
