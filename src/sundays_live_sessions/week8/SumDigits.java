package sundays_live_sessions.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {
    public static void main(String[] args) {

        System.out.println(" *** old version solution ***");

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("123", "52", "513", "1842"));

        ArrayList<Integer> sumOfNumbers = new ArrayList<>();

        for (String number : numbers) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - 48; // ascii number of (char) 1 = 49 : so 49-48 = 1(our char). That's why I subtract 48.
            }
            sumOfNumbers.add(sum);
        }

        System.out.println(sumOfNumbers);


        System.out.println("*** #2 solution (str.split(split point) & Integer.parseInt(ch)) ***");

        ArrayList<String> digits = new ArrayList<>(Arrays.asList("123", "52", "513", "1842"));
        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : digits) { // "123" - "52" ...
            //System.out.println(each);

            // ** str.split("") returns Array !! So first we create an Array, and we will assign values to our String with split method.
            String[] eachArr = each.split(""); // I've used charAt() method in first solution. [1,2,3]loop1 -[5,2]loop2 ...

            // System.out.println(Arrays.toString(eachArr));


            int sum = 0;
            // I've just split a String and assign them to a new array . Now I'll use that new array(eachArr) in for loop to get its elements.
            for (String eachDigit : eachArr) {
                //System.out.println(Integer.parseInt(eachDigit));
                sum += Integer.parseInt(eachDigit);  // String to Integer !!
            }

            sums.add(sum); // autobox the int to Integer
        }

        System.out.println(digits);
        System.out.println(sums);

    }
}

