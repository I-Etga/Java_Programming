package daily_videos.day23_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSetElement {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

         /*         #1 add element one by one
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

                    #2 add elements through
        numbers.addAll(Arrays.asList(1,2,3,4,5))
        */

        //numbers.add(4,0); --> adds and shift the left other to left
        //numbers.add(numbers.size() - 1,0); [1, 2, 3, 4, 0, 5]

        numbers.set(numbers.size() - 1, 0); // -->  change(set) the element at passed index

        //numbers.set(numbers.indexOf(3),0);  list.indexOf() ArraysList has also indexOf method

        System.out.println(numbers);
    }
}

