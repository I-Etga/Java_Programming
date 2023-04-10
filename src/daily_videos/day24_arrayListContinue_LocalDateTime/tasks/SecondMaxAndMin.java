package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMin {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, 3, -2, -2, 4, 5, 6, 7, 8, 8, 8, 8));

        //                     8 (fixed in this condition)   -2(fixed in this condition)
        list.removeIf(p -> p == Collections.max(list) || p == Collections.min(list));
        // removesIf holds the objects to be deleted and after holding all of them,it removes all at once and updates list at the end.
        // removeIf updates the list at the end of the process !! That's why max and min stays the same.


        System.out.println("Second maximum number is: " + Collections.max(list));
        System.out.println("Second minimum number is: " + Collections.min(list));

    }
}