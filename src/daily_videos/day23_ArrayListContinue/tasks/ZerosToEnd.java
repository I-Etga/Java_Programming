package daily_videos.day23_ArrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
/*
         I need a new ArrayList. So I create a new arrayList and assign the same value of original ArrayList.
         I'm not going to assign original arrayList directly to new arrayList. Because SAME OBJECT , any change affects both of them at the same time.
         So, we get wrong result ! --> [1, 2, 3, 4, 3, 0, 4, 0]

        ArrayList<Integer> numbersZerosToEnd = numbers; -->assign original arrayList directly to new arrayList
        */
        //create new ArrayList and assign manually .(I have to define new arrayList's capacity to set value of index independent.)
        ArrayList<Integer> numbersZerosToEnd = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        for (int i = 0, k = 0, z = numbers.size() - 1; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
            if (!(number == 0)) {
                numbersZerosToEnd.set(k++, number);
            } else {
                numbersZerosToEnd.set(z--, number);
            }
        }
        System.out.println(numbersZerosToEnd);

        System.out.println("*** #2 way ***");

        ArrayList<Integer> numbersZerosToEnd1 = new ArrayList<>();

        // how to define capacity(size/length) of arrayList (assigning zero as element and based on size of original arraylist)
        for (int i = 0; i < numbers.size(); i++) {
            numbersZerosToEnd1.add(0);
        }

        // now adding process is starting (after defining capacity of new arrayList)
        for (int i = 0, k = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
            if (!(number == 0)) {
                numbersZerosToEnd1.set(k++, number);
            }

        }
        System.out.println(numbersZerosToEnd1);
    }
}
