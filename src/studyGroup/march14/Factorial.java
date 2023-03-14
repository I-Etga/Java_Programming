package studyGroup.march14;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        // 5 4 3 2 1
        for (int i = number; i > 0; i--) {
            factorial *= i;

            System.out.println("i: " + i + " factorial= " + factorial);
        }
        System.out.println(factorial);
    }
}
