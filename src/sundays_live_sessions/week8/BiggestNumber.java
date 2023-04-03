package sundays_live_sessions.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 3, 7, 9, 123, 124, 243124, -5, -456));

        int max = Integer.MIN_VALUE; // good default for max
        int secondMax = numbers.get(0);

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        for (Integer number : numbers) {
            if (number < max && number > secondMax) {
                secondMax = number;
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
