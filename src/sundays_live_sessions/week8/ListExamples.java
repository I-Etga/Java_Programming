package sundays_live_sessions.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExamples {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(10);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>(list2); // this creates a new ArrayList with the same elements as list2
        System.out.println(list3);

        list3.add(0, 100);

        ArrayList<Integer> list4 = list3; // this is a new reference that points to the same object as list3

        System.out.println("-----------");
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println("-----------");

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list5);

//        method(new int[]{2, 1, 4});
//        method2(1, 2, 4, 1);

    }

    public static void method(int[] args) {

    }

    public static void method2(int... arr) {
        System.out.println(arr[2]);
    }
}
