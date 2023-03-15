package daily_videos.day16_nestedLoop.practice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("Would you like to enter another number? Yes/No");
            String answer = scanner.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) { // while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = scanner.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("Program is closing...");
                break;
            /*
                 With that code we have a bug here.(line 22)
                I can enter anything but no and program keeps running.
                            But I don't want to it.
                 Program is supposed to keep running if I enter only yes as an answer.
               That's why I have to use nested loop !
             */
            }
        }
    }
}
