package studyGroup.march14;

import java.util.Scanner;

public class Calcutator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int lastNumber = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= lastNumber ; i++) {
            sum += i;

            System.out.println("i: " + i + " sum =" + sum);
        }
        System.out.println(sum);
    }
}
