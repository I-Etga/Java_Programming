package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please input another number: ");
        int num2 = scanner.nextInt();

        boolean num1IsMaximum = num1 > num2;
        boolean num2IsMaximum = num2 > num1;
        boolean numbersAreEqual = num2 == num1;

        if (num1IsMaximum){
            System.out.println(num1 + " is the maximum number");
        }

        if (num2IsMaximum){
            System.out.println(num2 + " is the maximum number");
        }

        if (numbersAreEqual){
            System.out.println( "Numbers are equal");
        }
    }
}
