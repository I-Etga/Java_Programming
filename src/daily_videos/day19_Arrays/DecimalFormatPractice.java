package daily_videos.day19_Arrays;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {
                                        // demand pattern in String
        DecimalFormat df = new DecimalFormat("0.000");

        double d1 = 10.34387;
                        // the number comes after last number(3) according to format object is (6) and that's why last number will be rounded to 4(3+1) !
        System.out.println(df.format(d1));
        // print 10,346 why? because if the digits after our last number more than 5, last number will be rounded(+1).

        DecimalFormat df1 = new DecimalFormat("0");

        System.out.println(df1.format(d1)); // we get a whole number


    }
}
