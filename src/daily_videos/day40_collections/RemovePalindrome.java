package daily_videos.day40_collections;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );


        Iterator<String> it = names.iterator(); // We use hasNext, next, remove method through iterator obj.

        while (it.hasNext()) { // returns true as long as it can get an element !!
            String each = it.next();

            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse)) {
                // names.remove(each);
                it.remove();

            }
        }

        System.out.println(names);


        System.out.println("***** removeIf *****");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );
        //              reverse method is custom method that I created before !!
        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));

        //              There are also ready reverse method in some Classes
        //  names2.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );

        System.out.println(names2);

    }

}
