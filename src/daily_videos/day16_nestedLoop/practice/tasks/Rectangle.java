package daily_videos.day16_nestedLoop.practice.tasks;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter the length of the square: ");
            int length = scanner.nextInt();

            while (length <= 0) {
                System.err.println("Length of rectangle can't be negative or zero !!");
                System.out.println("Please enter length again: ");
                length = scanner.nextInt();
            }
            System.out.println("Enter the width of the square: ");
            int width = scanner.nextInt();

            while (width <= 0) {
                System.err.println("Width of rectangle can't be negative or zero!!");
                System.out.println("Please enter width again: ");
                width = scanner.nextInt();
            }

            System.out.println("Area of rectangle: " + (length * width)); // If I did not use parentheses, the concatenation operator would run first !
            System.out.println("Perimeter of rectangle: " + (2 * (length + width)));

            System.out.println("Would you like to enter a side of another square?Yes/No");
            String lastAnswer = scanner.next().toLowerCase().trim();
            while (!(lastAnswer.equals("yes") || lastAnswer.equals("no"))) {
                System.err.println("Invalid entry");
                System.out.println("Please enter only yes/no!: ");
                lastAnswer = scanner.next().toLowerCase().trim();
            }
            if (lastAnswer.equals("yes")) {
                isTrue = true;
            } else {
                System.out.println("Program is closing ...");
                System.exit(1); // return also works
            }
        }
    }
}
