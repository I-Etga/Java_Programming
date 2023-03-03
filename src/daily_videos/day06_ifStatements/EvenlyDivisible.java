package daily_videos.day06_ifStatements;

import java.util.Scanner;

public class EvenlyDivisible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isDivisbleBy2 = number % 2 == 0;
        boolean isDivisbleBy3 = number % 3 == 0;
        boolean isDivisbleBy5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + isDivisbleBy2);
        System.out.println(number + " is divisible by 3: " + isDivisbleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisbleBy5);

    }
}
