package daily_videos.day09_scanner;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NextLine_vs_Next {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        TimeUnit.MILLISECONDS.sleep(500);

        scanner.nextLine(); // to delete enter from memory of scanner !!


        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine(); // because there is at least one space between first and last name;

        TimeUnit.MILLISECONDS.sleep(700);

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

        scanner.close();


    }
}
