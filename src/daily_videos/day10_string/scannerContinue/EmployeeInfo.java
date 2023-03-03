package daily_videos.day10_string.scannerContinue;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();

        System.out.println("Enter your gender: ");
        char gender = scanner.next().charAt(0);

        scanner.nextLine();

        System.out.println("Enter your Company name: ");
        String companyName = scanner.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle = scanner.nextLine();


        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Employee Info: ");
        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + companyName + "\n" + jobTitle + "\n" + salary);

        scanner.close();

    }
}
