package daily_videos.day20_forEach.tasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 2, 4, 8, 6, 7, 9, 2};

        int count1 = 0;
        for (int number : numbers) {
            int count = 0;
            for (int i : numbers) {
                if (number == i) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(number + " ");
                count1++;
            }
        }

        int[] uniques = new int[count1]; // {1,3,5}
        int j = 0; //1,2,3
        for (int number : numbers) {
            int count = 0;
            for (int i : numbers) {
                if (number == i) {
                    count++;
                }
            }
            if (count == 1) {
                uniques[j++] = number;
            }
        }
        System.out.println(Arrays.toString(uniques));
    }
}
