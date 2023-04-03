package sundays_live_sessions.week8;

import java.text.DecimalFormat;
import java.util.Arrays;


public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 3,940,000 results (0.39 resultArray) ";

        result = result.replaceAll(",", "");// About 3940000000 results (0.39 resultArray) (remove all commas. Comma may prevent converting process)
        //System.out.println(result);

        String[] resultArray = result.split(" ");// [About, 3940000000, results, (0.39, resultArray)]
        //System.out.println(Arrays.toString(resultArray));

        //System.out.println(resultArray[1]); // we get 3,940,000,000, but it's a String. We have to convert it to Long.

        long results = Long.parseLong(resultArray[1]); // Now we get the result number as long . Task is partly done.
        //System.out.println(results);

        if (results > 100000000) {
            System.out.println("Narrow your search, too many results: " + results);
        } else if (results < 100000000) {
            System.out.println("Good Search: " + results);
        }

        //System.out.println(resultArray[3]); // (0.39

        double seconds = Double.parseDouble(resultArray[3].substring(1)); // (0.39 I should remove '('. So I've used here substring(beginIndex:1);

        if (seconds <= 0.85) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // System.out.println(seconds <= 0.85 ? "PASS" : "FAIL"); [ternary]

    }
}
