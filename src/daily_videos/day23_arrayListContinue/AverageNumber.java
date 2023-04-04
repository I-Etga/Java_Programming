package daily_videos.day23_arrayListContinue;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
                /*  <---------->
                NO NON-PRIMITIVES
                AND ONLY WRAPPER CLASS (int X , Integer √)


                in the reference type it's mandatory to enter data type.
                but in the initialization part it's optional
                 */

        list.add(20); // if [line7]ArrayList<Integer> list; ->not initialized yet !! we get compiler error !!
        //I entered an int, but it's implicitly wrapped !! int -> Integer  [autoboxing]

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum = 0;

        for (Integer integer : list) {
            sum+= integer;
        }

        double average = (double) sum /list.size(); // average is usually decimal number. So I use double as data type.
        /*                  int/int = int . So if I want to get EXACT number, I have to cast at least one of these ints to double.
                            (w/ casting average = 41.42857142857143 , w/o casting 41)    */

        System.out.println("average = " + average);

    }
}
