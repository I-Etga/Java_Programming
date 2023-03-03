package daily_videos.day09_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number\nSo I can say if it's odd or even :");
        int number = scanner.nextInt();
        String result = number + "";

        if (number % 2 == 0) {
            result += " is even.";
        } else {
            result += " is odd";
        }
        System.out.println(result);
        scanner.close();
    }
}
