package daily_videos.day15_LoopsContinue;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 2147483647;
        /*This is the largest integer.
            That means any integer has to be less than 2147483647 !!

         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();

            if(num <min){
                min = num;
            /*  -If the user entered, and three is less
                    than Current minimum number that we have.
                -Then user entered number should be the maximum number
             */
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}
