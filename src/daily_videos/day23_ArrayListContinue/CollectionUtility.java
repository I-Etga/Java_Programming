package daily_videos.day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionUtility {
    public static void main(String[] args) {

        System.out.println("***** Collections.min() & .max() methods");
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 2, 3, 7, 8, 10));

        int max =Collections.max(integers); // it returns which data typ Arraylist has in the parentheses.
        System.out.println(Collections.max(integers));

        int min = Collections.min(integers);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("********** Collections.sort() method **********");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Patato","Milk","Tomato","Rice","Orange","Strawberry", "Blueberry","Paper Towels"));


        Collections.sort(items); // once we passed the list, it'll be sorted !!
        // It's going to sort string like dictionary. Camel -> Car --> Day ->Yogurt

        System.out.println(items);

        System.out.println("***** Collections.reverse()   ");

        Collections.reverse(items);

        System.out.println(items);//--> last element will be first , first element will be last element.

        System.out.println("***** Collection.swap()  ");

        ArrayList<String> employeeList = new ArrayList<>();
                                        //     0       1        2        3
        employeeList.addAll(Arrays.asList("Barney", "Rachel", "Ross", "Amy"));

        Collections.swap(employeeList,0,3); // it just changes index order !!
                                       //     0       1        2        3
        System.out.println(employeeList); //[Amy,   Rachel,   Ross,   Barney]


    }
}
