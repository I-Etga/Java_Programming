package daily_videos.day10_string.scannerContinue;

import java.util.Scanner;

public class ShippingAdrdress {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = scanner.next();

        /*
        DO NOT FORGET / WHENEVER USE NEXTLINE AFTER ANYOTHER NEXT METHOD , YOU HAVE TO CLEAR UP THE SCANNER MEMORY
                                    THIS IS HOW : EMPTY NEXTLINE !! scanner.nextLine();

         */
        scanner.nextLine();


        System.out.println("Enter your Street name: ");
        String streetName = scanner.nextLine();

        System.out.println("Enter your city: ");
        String cityName = scanner.nextLine();

        System.out.println("Enter your State: ");
        String stateName = scanner.nextLine();

        System.out.println("Enter your Zip code: ");
        String zipCode = scanner.next();


        System.out.println("Your shipping address is: ");
        System.out.println("\t" + fullName +
                "\n " + "\t" + buildingNumber + " " + streetName +
                "\n\t" + cityName + ", " + stateName + " " + zipCode);

        scanner.close();
    }
}
