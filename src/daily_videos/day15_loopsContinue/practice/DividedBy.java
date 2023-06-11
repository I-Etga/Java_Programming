package daily_videos.day15_loopsContinue.practice;

import java.util.Scanner;

public class DividedBy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        String dividedBy15 = "";
        String dividedBy5 = "";
        String dividedBy3 = "";

        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                dividedBy15 += " " + i;
            } else if (i % 3 == 0) {
                dividedBy3 += " " + i;
            } else if (i % 5 == 0) {
                dividedBy5 += " " + i;
            }

        }
        System.out.println("divided by 15: " + dividedBy15);
        System.out.println("divided by 5: " + dividedBy5);
        System.out.println("divided by 3: " + dividedBy3);
    }
}
