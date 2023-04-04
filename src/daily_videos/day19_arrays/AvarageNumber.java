package daily_videos.day19_arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number do you want to enter?");
        int total = scanner.nextInt();

        int[] numbers = new int[total];

        int sum = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number:");
            numbers[i] = scanner.nextInt();

            sum+= numbers[i];
        }

        double avarage = sum/(double)total;
        // int/int returns int. So I should cast one of the integer to double to get the exact decimal number!

        DecimalFormat df = new DecimalFormat("0.00");
                        // to round the value. More zeros after period we have, the more digits of decimal part are printed.

        System.out.println(Arrays.toString(numbers));
        System.out.println("sum=" + sum);
        System.out.println("average" + df.format(avarage));
    }
}
