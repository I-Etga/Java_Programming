package daily_videos.day22_wrapperClasses.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinNum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(123, 1, 2, 3, 4, 5, 5, 6, 7, 8, 1, 2,-4, 4, 5));

        int max = Integer.MIN_VALUE; //numbers.get(0); 1 2 3 4 5 6 7 8 123 [in order to get the element at specified index , numbers[0] illegal-X]
        int min = Integer.MAX_VALUE; //numbers.get(0); 1 4

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

