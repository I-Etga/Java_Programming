package daily_videos.day24_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilitiesMethods {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Swift", "Java"));

        // without collection method replaceAll()

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")) {
                names.set(i, "Python");
            }
        }
        //                            -All Javas were replaced with Pyhton
        System.out.println(names); //[Python, Python, Python, C#, C#, Ruby, Swift, Swift, Swift, Python]

        System.out.println("*** #2 Collections.replaceAll(collection, current element, new element)***");

        ArrayList<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Swift", "Java"));

        Collections.replaceAll(names2, "Java", "Python");

        System.out.println(names2); // [Python, Python, Python, C#, C#, Ruby, Swift, Swift, Swift, Python]

        System.out.println("*** Collections.frequency(collection, element )");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 50, 50, 50, 50, 50, 50, 60, 50, 50, 50));

        int frequency = Collections.frequency(list, 50);
        System.out.println(frequency);

        System.out.println("--");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Swift", "Java"));

        int frequency2 = Collections.frequency(list2, "Java");
        System.out.println(frequency2);

        System.out.println("*** find out unique element of a Arraylist with Collections.frequency(collection,element)");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 20, 30, 40, 50, 50, 50, 50, 50, 50, 60, 50, 50, 50));

        int frequency3 = Collections.frequency(list3, 50);

        for (Integer integer : list3) {
            if (Collections.frequency(list3, integer) == 1) { // That's mean it's unique !!
                System.out.println(integer);
            }
        }

    }
}
