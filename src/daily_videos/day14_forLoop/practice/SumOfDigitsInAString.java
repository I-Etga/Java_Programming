package daily_videos.day14_forLoop.practice;

import java.util.Scanner;

public class SumOfDigitsInAString {
    public static void main(String[] args) {

        // ex:"Ankara'nin plakasi 06, Istanbul 34 , Izmir 35 , Osmaniye 80 ve son olarak An0tal8ya"
        //                              -> out:37
        System.out.println("Please enter your word or sentence: ");
        int result = sumOfDigitInString(new Scanner(System.in).nextLine());
        System.out.println(result);
        // short version: (System.out.println(ew Scanner(System.in).next()))
    }

    public static int sumOfDigitInString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - 48; // explanation is at the end !!
            }
            System.out.println("i:" + i + " ch:" + str.charAt(i) + " sum= " + sum);
                        /*
                        this is how you can see how the for loop and our code works!!)
                       We don't actually have to write even that print statement.
                                but I want to see how it works !
                         */
        }
        return sum;
    }
}
/*
                    WHY -48? It's all about ascii table.
                    '0'-> 48 -to get 0 we should subtract from ascii number 48 !!
                    '1'-> 49 --> 49-48 = 1
                    '2'-> 50 --> 50-48 = 2
                    ...
                    '9'-> 49 --> 57-48 = 9
                    System.out.println((int)'1'); (this is how you can see the ascii character count)


 */