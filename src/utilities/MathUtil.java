package utilities;

import java.text.DecimalFormat;

public class MathUtil {

    public static double format (double num){

        DecimalFormat df = new DecimalFormat("#.##");
        // df good but returns String. We can't use it in math operations directly.
        //                          String --> parse method --> Double
        return Double.parseDouble(df.format(num));
    }
}
