package daily_videos.day22_wrapperClasses.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinNum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, -4, 1, 2, 4, 5, 123));

        int max = numbers.get(0); // in order to get the element at specified index , numbers[0] illegal-X
        int min = numbers.get(0);

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
/*
4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */
