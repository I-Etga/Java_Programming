package daily_videos.day23_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 4;

        for (int i = 1; i < n; i++) {
            list.removeAll(Arrays.asList(Collections.max(list)));
        }

        System.out.println(Collections.max(list));

    }
}

