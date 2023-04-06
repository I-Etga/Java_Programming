package daily_videos.day19_arrays;

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


        System.out.println("*** difference between #.## and 0.00  as pattern ***");
        DecimalFormat dfA = new DecimalFormat("#.####");
        DecimalFormat dfB = new DecimalFormat("0.0000");

        double db1 = 32.6780;
        // What is the difference of pattern "#.##" and "0.00" :
        System.out.println(dfA.format(db1)); // 32,678 -> if we use #, it's ignores white! zeros. [32,6780 == 32,678]
        System.out.println(dfB.format(db1)); // 32,6780 -> As pattern if we use zeros , it does not white zeros !
    }
}
