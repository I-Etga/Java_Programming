package daily_videos.day23_ArrayListContinue;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        // We've not covered the addAll() method. That's why we'll add one element at a time !

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        for (Integer integer : list) {
            int frequency = 0;
            for (Integer integer1 : list) {
                if (integer == integer1) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(integer);
                break; // the trick of this task !!
                /*
                  Once the condition returns true which means that  we've found the first unique number,
                    break statement exits loop. We have to use it. Otherwise, it'll print all unique elements.
                  We can use return statement or System.exit(1) code, but they end the program. */
            }
        }
    }
}

