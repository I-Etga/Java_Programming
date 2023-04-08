package daily_videos.day24_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        String uniques = "";
        for (Integer each : list) {
            int frequency = Collections.frequency(list,each);
            if(frequency == 1 && !uniques.contains(""+ each)){
                uniques += each + " ";
            }
        }
        System.out.println(uniques);
    }
}
