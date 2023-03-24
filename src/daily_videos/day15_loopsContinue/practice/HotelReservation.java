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
        }else{
            System.out.println("Which room would you like to book?\nKing bed ==>120$ \nQueen Bed ==> 100$\nSingle Bed==>80$");
            scanner.nextLine();
            answer = scanner.nextLine();

            while (!(answer.equalsIgnoreCase("King Bed")
                    || answer.equalsIgnoreCase("Queen Bed")
                    || answer.equalsIgnoreCase("Single Bed"))) {

                System.out.println("Invalid entry.Please enter again ! (Single Bed, King Bed or Queen Bed)");
                answer = scanner.nextLine();
            }
        }
        String message = "You've reserved a ";
        int price = 0;

        if ( answer.equalsIgnoreCase("King Bed")) {
            price = 120;
            message += answer + " room. And the total price of this room; "+ price + "$";
        } else if ( answer.equalsIgnoreCase("Queen Bed")) {
            price = 100;
            message += answer+ " room. And the total price of this room; "+ price + "$";
        } else {
            price = 80;
            message += answer + " room. And the total price of this room; "+ price + "$";
        }
        System.out.println(message);
    }
}
