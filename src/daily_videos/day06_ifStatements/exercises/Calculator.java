package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter a math operator( +,-,*,/,% ): ");
        int mathOperator = scanner.next().charAt(0);
        // get input of char !!
        // there is no specific method for this. That's why we get that over next()-string method.

        int result = 0;


        boolean isAddition = mathOperator == '+';
        boolean isSubtract = mathOperator == '-';
        boolean isDivision = mathOperator == '/';
        boolean isMultiplication = mathOperator == '*';
        boolean isMod = mathOperator == '%';
        boolean isInvalidOperator = !isAddition && !isSubtract && !isMultiplication && !isDivision && !isMod;


        if (isInvalidOperator) {
            System.out.println("Invalid Operator. Please choose only the following operators: +,-,*,/,% ");
        } else if (isAddition) {
            result = n1 + n2;

        } else if (isSubtract) {
            result = n1 - n2;

        } else if (isMultiplication) {
            result = n1 * n2;

        } else if (isDivision) {
            result = n1 / n2;

        } else {
            result = n1 % n2;

        }
        System.out.println(result);
    }
}