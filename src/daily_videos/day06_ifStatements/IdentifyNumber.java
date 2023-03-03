package daily_videos.day06_ifStatements;

import java.util.Scanner;

public class IdentifyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        boolean isPositive = a > 0;
        boolean isNegative = a < 0; // we can NOT here !isPositive. Because this is not the only one posibility.
                                                                // it can be also zero

                                            //alternative way to print zero
        boolean isZero = a == 0; // or we can use another statement >> !isPositive && !isNegative;
                                        // that means if the number NOT positive and NOT negative; then it's zero.

        System.out.println(a + " is positive number: " + isPositive );
        System.out.println(a + " is positive number: " + isNegative );
        System.out.println(a + " is positive number: " + isZero );

    }
}
