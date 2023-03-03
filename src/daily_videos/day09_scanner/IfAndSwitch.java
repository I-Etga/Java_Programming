package daily_videos.day09_scanner;

import java.util.Scanner;

public class IfAndSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many people are there on board: ");
        int numberOfPeople = scanner.nextInt();
        int numberOfCrew = 0;
        int numberOfPassengers = 0;
        String result = "";

        if (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100) {

            switch (numberOfPeople) {
                case 50:
                    numberOfCrew = 20;
                    numberOfPassengers = 30;
                    result = ("Number of people on board: " + numberOfPeople +
                            "\nNumber of the crew: " + numberOfCrew +
                            "\nNumber of the Passengers: " + numberOfPassengers);
                    break;
                case 75:
                    numberOfCrew = 25;
                    numberOfPassengers = 50;
                    result = ("Number of people on board: " + numberOfPeople +
                            "\nNumber of the crew: " + numberOfCrew +
                            "\nNumber of the Passengers: " + numberOfPassengers);
                    break;
                default:
                    numberOfCrew = 30;
                    numberOfPassengers = 70;
                    result = ("Number of people on board: " + numberOfPeople +
                            "\nNumber of the crew: " + numberOfCrew +
                            "\nNumber of the Passengers: " + numberOfPassengers);
                    break;
            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);
        scanner.close();
    }
}