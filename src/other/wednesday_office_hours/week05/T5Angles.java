package other.wednesday_office_hours.week05;

import java.util.Scanner;

public class T5Angles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, please enter 3 angles. Hit enter after each enter");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum == 180) {
            System.out.println("Triangle");
        } else if (sum == 360) {
            System.out.println("Circle");
        } else {
            System.out.println("Cannot determine");
        }

        /*
        int count = 1;
        System.out.println("Enter angle" + count++);
        System.out.println("Enter angle" + count++);

         */
    }
}
/*
T5Angles [Scanner, conditional]

    Create a program that will ask the user to enter 3 angles.
    Add the sum of the angles and print what type of shape is made from the angles.
        If the angles add up to 180 print triangle.
        If the angles add up to 360 print circle
        For any other angle print: Cannot determine
 */
