package daily_videos.day09_scanner;

import java.util.Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people are there on Board?: ");
        int numberOfPeople = scanner.nextInt();

        int numberOfCrew = 0;
        int numberOfPassengers = 0;
        String result = "";
        String result1 = "";
        String result2 = "";

        System.out.println("*********Solution with Ternary ***********");


        result1 = (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100) ?
                (numberOfPeople == 50) ? "20 crew, 30 Passengers"
                        : (numberOfPeople == 75) ? "25 crew, 50 Passengers"
                        : "30 crew,70 Passengers"
                : "Invalid";
        System.out.println(result1);
                                    /*                REALLY IMPORTANT
                                             normally after ?(if) comes a value.
                                             if we want to use inner if statement as ternary;
                                             we write the condition right after ?(if) and writes once more ?(if)
                                              */

        System.out.println("*********Solution with switch ***********");

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
            case 100:
                numberOfCrew = 30;
                numberOfPassengers = 70;
                result = ("Number of people on board: " + numberOfPeople +
                        "\nNumber of the crew: " + numberOfCrew +
                        "\nNumber of the Passengers: " + numberOfPassengers);
                break;
            default:
                result = "Invalid ";
        }
        System.out.println(result);
        System.out.println("**********2nd Way Switch********");

        switch (numberOfPeople) {
            case 50:
                result2 = ("20 crew, 30 passengers");
                break;
            case 75:
                result2 = ("25 crew, 50 passengers");
                break;
            case 100:
                result2 = ("30 crew, 70 passengers");
                break;
            default:
                result2 = "Invalid ";
        }
        System.out.println(result2);
        scanner.close();
    }
}
