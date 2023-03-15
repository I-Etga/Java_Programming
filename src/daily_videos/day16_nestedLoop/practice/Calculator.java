package daily_videos.day16_nestedLoop.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter your first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the math operator:");
            char operator = scanner.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {  // while the operator is invalid
                System.err.println("Invalid Operator! please re-enter the math operator");
                operator = scanner.next().charAt(0);
            }

            System.out.println("Enter your second number:");
            double num2 = scanner.nextDouble();

            double result = (operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2 : (operator == '*') ? num1 * num2 : num1 / num2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue?Yes/no");
            answer = scanner.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Answer! Would you like to continue?Yes/no");
                answer = scanner.next().toLowerCase();
            }


        }
    }
}

