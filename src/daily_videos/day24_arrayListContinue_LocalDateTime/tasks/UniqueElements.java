package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();// initialize

        numbers.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        //                each 1 1 2 3 ...
        numbers.removeIf(p -> Collections.frequency(numbers, p) > 1);

        /* #2 old version solution
           String uniques = "";
        for (Integer each : list) {
            int frequency = Collections.frequency(list,each);
            if(frequency == 1 && !uniques.contains(""+ each)){
                uniques += each + " ";
            }
        }
         */
        System.out.println(numbers);
    }
}
