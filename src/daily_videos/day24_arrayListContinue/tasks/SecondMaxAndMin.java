package daily_videos.day24_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMin {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        // Firstly, I am going to find max and min , then I get max and min which means I'll get second max and min !!

        list.remove(Collections.max(list));
        list.remove(Collections.min(list));

        // I've just removed the min and second. Max and min gives us now second max and second min.

        System.out.println("Max =" + Collections.max(list));
        System.out.println("Min =" +Collections.min(list));

    }
}