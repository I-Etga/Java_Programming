package daily_videos.day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsSameObject {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> list2 = list1;

        list1.remove((Integer)6);
        /*
        Logically it's supposed to remove an element only from list1.But;
        list1.remove() affects list2 as well. Because they use the SAME OBJECT!!

        So if any of these lists change, they both change !!
         */

        list2.add((Integer)34);

        System.out.println(list1); //[1, 2, 3, 4, 5, 34]
        System.out.println(list2); // [1, 2, 3, 4, 5, 34]

    }
}
