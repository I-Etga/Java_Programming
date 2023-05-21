package daily_videos.day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90] ==> allows duplicates

        System.out.println("----------------------------------------");
        // Set is subclass of Collection and that's why it has addAll() method !!
        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null key
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null, null)); // only one "null" is accepted. Because it does NOT allow duplicates.8

        System.out.println(set1); // [null, 200, 40, 10, 90, 300] ==> NO duplicates !!

        System.out.println("----------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();  // keeps insertion order, accepts null key
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);


        System.out.println("----------------------------------------");

        String str = null;
        // System.out.println(str.toLowerCase());[NullPointerExceptions]
        // Because we can't call method through null keyword !!


        Set<Integer> set3 = new TreeSet<>(); // Keeps sorted order, does not accept duplicate


        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //  set3.addAll(Arrays.asList(null, null, null, null, null));

        // Sorted order. It checks the values of each object.
        //We can't call method through null keyword !!
        // That's why in TreeSet we are not allowed to add null keyword !![NullPointerExceptions]

        System.out.println(set3); // [10, 40, 90, 200, 300] (sorted !!)


        System.out.println("----------------------------------------");
        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words)); // keeps insertion order. If it is not LinkedHashSet(e.g. HashSet or TreeSet), order wouldn't be kept !!

        System.out.println(result);

        /*
        // System.out.println(result.get(1));
         NO index and that's why no retrieve. So no get method !!
        (If you check the Collection common methods, you'll see no get method in the table !!)

        for (String each : result) {
            System.out.println(each);
        }
        */

        System.out.println(new ArrayList<>(result).get(1));

        words = result.toArray(new String[0]);  // converting Set to Array !!!!
        //


        System.out.println("Words Array : " + Arrays.toString(words));


        System.out.println("----------------------------------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50, 5, 5, 5, 1, 1, 1, 2, 2, 2));

        System.out.println(numbers); //[10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50, 5, 5, 5, 1, 1, 1, 2, 2, 2]

        Set<Integer> n = new TreeSet<>(numbers); // List to Set [removes duplicates and sorts (order)]

        System.out.println(n);

        numbers = new ArrayList<>(n);// --> re-assign numbers ArrayList after removing duplicates and sorting elements !!

        System.out.println(numbers); // [1, 2, 5, 10, 20, 30, 40, 50] (Check out line 95 to see the change !! )

        /*
        So, if I want to remove the duplicates and sort elements of a Collection, I can use the constructor of TreeSet Class.
        All subclasses of Collection have one default and one with collection parameter constructor !!
        We can convert one to another through constructor !! e.g. line 97, 101 ...
         */


    }
}
