package daily_videos.day23_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumbersMultiplyBy2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> oddMultipliedBy2 = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddMultipliedBy2.add(number * 2);
            } else {
                oddMultipliedBy2.add(number);
            }
        }
        System.out.println(oddMultipliedBy2);
    }
}

