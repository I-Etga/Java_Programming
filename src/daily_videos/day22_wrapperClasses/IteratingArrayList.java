package daily_videos.day22_wrapperClasses;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        numbers.add(3,255); // shifted elements which come after given index right !!

        //numbers.add(300,10000); //
        /*  we get  IndexOutOfBoundsException.
            If we want to insert an element into arraylist with index number through add method;
                        the maximum index could be given can the last index of that arraylist.
                                                                      #arrayList.size()-1
         */
        System.out.println(numbers);

        System.out.println("--------------");

        System.out.println("**** from first to last ******");
        // printing  elements from starting to end
        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i);
            System.out.println(each);
        }

        System.out.println("**** from last to first ******");

        // printing elements from end to start
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int each = numbers.get(i);
            System.out.println(each);
        }

        System.out.println("---------");

        for (Integer number : numbers) {
            System.out.println(number);
        }

    }
}
