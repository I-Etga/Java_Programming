package daily_videos.day15_loopsContinue.practice;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number > 0) {
            sum += number;
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();

            /*
                MOST IMPORTANT PART OF WHILE LOOP
           -=Don't forget that part.
            -You declare a variable so loops works properly.
            -in this case: number.
            -I have to request a value to assign to the variable that I declared before the loop
                    at the end of each loop so that the loop is checked again.
             */
        }
        System.out.println(sum);
    }
}
