package daily_videos.day16_nestedLoop.practice.tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter the radius of the circle: ");
            int answer = scanner.nextInt();

            while (answer <= 0) {
                System.out.println("Radius can't be negative or zero !!\nPlease enter a radius of the circle: ");
                answer = scanner.nextInt();
            }
            System.out.println("Diameter of circle: " + 2 * answer);
            System.out.println("Area of circle: " + Math.PI * answer * answer);
            System.out.println("Perimeter of circle: " + 2 * Math.PI * answer);

            System.out.println("Would you like to enter a radius of another circle?Yes/No");
            String lastAnswer = scanner.next().toLowerCase().trim();
            while (!(lastAnswer.equals("yes") || lastAnswer.equals("no"))) {
                System.out.println("Please enter only yes/no!: ");
                lastAnswer = scanner.next();
            }
            if (lastAnswer.equals("yes")) {
                isTrue = true;
            } else if (lastAnswer.equals("no")) {
                System.out.println("Program is closing ...");
                return;
            }
        }
    }
}
