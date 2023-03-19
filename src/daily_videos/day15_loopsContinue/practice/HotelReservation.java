package daily_videos.day15_loopsContinue.practice;

import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to book a room?");
        String answer = scanner.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry.Please enter yes/no:");
            answer = scanner.next();
        }

        if (answer.equals("no")) {
            System.out.println("Have a nice day. Goodbye!");
            return;
        } else {
            System.out.println("Which room would you like to book?\nKing bed ==>120$ \nQueen Bed ==> 100$\nSingle Bed==>80$");
            answer = scanner.next();
            while (!(answer.equalsIgnoreCase("King Bed")
                    || answer.equalsIgnoreCase("King")
                    || answer.equalsIgnoreCase("Queen Bed")
                    || answer.equalsIgnoreCase("Queen")
                    || answer.equalsIgnoreCase("Single Bed")
                    || answer.equalsIgnoreCase("Single"))) {
                System.out.println("Invalid entry.Please enter again ! (Single, King, Single Bed)");
                answer = scanner.next();
            }
        }
        String message = "";
        if (answer.equalsIgnoreCase("King") || answer.equalsIgnoreCase("King Bed")) {
            message = "You've reserved a Kind Bed room. And the total price of this room: 120$";
        } else if (answer.equalsIgnoreCase("Queen") || answer.equalsIgnoreCase("Queen Bed")) {
            message = "You've reserved a Queen Bed room. And the total price of this room: 100$";
        } else {
            message = "You've reserved a Single Bed room. And the total price of this room: 80$";
        }

        System.out.println(message);
    }
}
