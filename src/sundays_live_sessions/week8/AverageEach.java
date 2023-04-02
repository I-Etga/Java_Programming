package sundays_live_sessions.week8;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AverageEach {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        // We can print how many decimal number we want with this class !! (more 0 after period(.), more decimal number)

        int[][] numbers = {{3, 4, 5, 6}, {5, 2, 6}, {10, 40, 20}};

        double averageOf1DArrays = 0;
        for (int[] nums : numbers) {
            double sum = 0;

            for (int num : nums) {
                sum += num;
            }

            double average = sum / nums.length;
            averageOf1DArrays += average;

            System.out.println("average of: " + Arrays.toString(nums) + " is " + df.format(average));
        }

        double overallAverage = averageOf1DArrays / numbers.length;
        System.out.println("average of all : " + Arrays.deepToString(numbers) + " is " + df.format(overallAverage));
    }
}
