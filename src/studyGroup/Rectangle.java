package studyGroup;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isTrue = true;
        while (isTrue) {

            System.out.println("Enter the length of the Rectangle:");
            double length = scanner.nextDouble();

            while (length <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.out.println("Enter the length of the Rectangle:");
                length = scanner.nextDouble();
            }

            System.out.println("Enter the width of the Rectangle:");
            double width = scanner.nextDouble();

            while (width <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.out.println("Enter the width of the Rectangle:");
                width = scanner.nextDouble(); // -10 -9 6
            }

            // length 4  width 6

            System.out.println("Area of the rectangle is : " + (length * width));
            System.out.println("Perimeter of the perimeter is : " + (2 * (length + width)));

            System.out.println("Would you like to calculate another Rectangle? Yes/No");
            String answer = scanner.next().toLowerCase().trim();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry");
                System.out.println("Please enter Yes/No");
                answer = scanner.next();
            }

            // isTrue = true

            if (answer.equals("no")) {
                System.exit(1); // 2.- isTrue = false , 3- return .
            }
        }
    }
}
