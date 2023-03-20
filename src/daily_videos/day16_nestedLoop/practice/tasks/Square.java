package daily_videos.day16_nestedLoop.practice.tasks;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter the side of the square: ");
            int answer = scanner.nextInt();

            while (answer <= 0) {
                System.out.println("Side of square can't be negative or zero !!\nPlease enter again:");
                answer = scanner.nextInt();
            }
            System.out.println("Area of square: " + (answer * answer)); // If I did not use parentheses, the concatenation operator would run first !
            System.out.println("Perimeter of square: " + (4 * answer));

            System.out.println("Would you like to enter a side of another square?Yes/No");
            String lastAnswer = scanner.next().toLowerCase().trim();
            while (!(lastAnswer.equals("yes") || lastAnswer.equals("no"))) {
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
