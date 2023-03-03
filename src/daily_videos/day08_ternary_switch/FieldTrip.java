package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Level: ");
        int grade = scanner.nextInt();
        String location = "Unknown"; // this is just temporary value
        int numberOfGroups = 0;
        String teacher = "Unknown";


        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numberOfGroups = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacher = "Ms. Lela";
            } else {
                location = "Six Flags";
                numberOfGroups = 8;
                teacher = "Mr. White";
            }
            System.out.println("Local- " + location);
            System.out.println("Number of Groups- " + numberOfGroups);
            System.out.println("Teacher in charge- " + teacher);
        } else {
            System.out.println("Invalid value");
        }

    scanner.close();
    }

}
