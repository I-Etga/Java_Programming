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

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); //size 5 6 7 8 9 ....
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
                        // size: 5 6 7 8 ... infinite loop
        for (Integer integer : numbers1) {
            numbers2.add(integer);
        }
        numbers1 = numbers2; // [[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]]

        System.out.println(numbers1);
    }
}
