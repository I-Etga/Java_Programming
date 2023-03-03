package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter Number3: ");
        int num3 = scanner.nextInt();

        String result = "";

        boolean isAllEqual = num1 == num2 && num2 == num3;
        boolean isN1N2Equal = num1 == num2 && num2 != num3;
        boolean isN2N3Equal = num2 == num3 && num3 != num1;
        boolean isN1N3Equal = num1 == num3 && num1 != num2;
        boolean areNoneEqual = num1 != num2 && num2 != num3 && num1 != num3;

        if (isAllEqual) {
            result = "All of them are equal";
        } else if (isN1N2Equal) {
            result = "Number 1 and Number 2 are equal";
        } else if (isN1N2Equal) {
            result = "Number 1 and Number 2 are equal";
        } else if (isN2N3Equal) {
            result = "Number 2 and Number 3 are equal";
        } else {
            result = "None of them are equal";
        }
        System.out.println(result);

    }
}