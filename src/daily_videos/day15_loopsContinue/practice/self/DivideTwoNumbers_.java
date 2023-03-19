package daily_videos.day15_loopsContinue.practice.self;

import java.util.Scanner;

public class DivideTwoNumbers_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int b = scanner.nextInt();

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println("Number1 / number2 = " + count + " remainder 5= " + a);
    }
}