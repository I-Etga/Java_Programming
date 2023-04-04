package daily_videos.day23_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        //#1 way (addAll() method)
        numbers.addAll(numbers);

        System.out.println(numbers); // [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        //#2 way (for each loop)

        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (Integer number : numbers) {
            numbers1.add(number);
        }

        System.out.println(numbers1); // [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
    }
}
