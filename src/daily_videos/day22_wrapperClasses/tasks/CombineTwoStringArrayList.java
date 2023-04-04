package daily_videos.day22_wrapperClasses.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArrayList {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C", "-"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        //list.add(e) --> adds element to element. So it may take a lot !!
        //list.add("B");

        // #1 list.add(e) and for each loop
        for (String each : arr1) {
            list.add(each);
        }

        for (String each : arr2) {
            list.add(each);
        }

       /*   #2 way addAll(collection) method ;
        We can add ONLY ONCE ARRAY at once !

        list.addAll(Arrays.asList(arr1)); !
        System.out.println(list); // [A, B, C]

        list.addAll(Arrays.asList(arr2));
        System.out.println(list);// [A, B, C, D, E, F, G]
        */

        /*
         regular arrayList method accepts non-primitives like "Ankara" , 8 , 'a' ...
         list.add("A"); or list1.add(10.4); ...

        But Bulk operations or constructor of arraylist (addAll(), ...All()\\ new ArrayList<>();) accepts only collection.

        to convert an array to arrayList(a kind of collection) , we use array method !
                Arrays.asList(arr1) or Arrays.asList({"A", "B", "C"})

                list.addAll(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        */

    }
}