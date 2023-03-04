package daily_videos.day11_StringContinue;

import java.util.Scanner;

public class ComputerBuild {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screenSize = scanner.nextDouble();

        System.out.println("Select CPU type:");
        String cpuType = scanner.next().toLowerCase();

        System.out.println("Select RAM size:");
        int ramSize = scanner.nextInt();
        int ramPrice = (ramSize / 4) * 50;

        System.out.println("Select storage type:");
        String storageType = scanner.next().toUpperCase();


        System.out.println("Select storage size:");
        int storageSize = scanner.nextInt();
        int storagePrice = storageSize / 500;

        System.out.println("Select screen resolution:");
        String screenResolution = scanner.next().toUpperCase();

        double total = 0;

        if (screenSize == 13.3) {
            total += 200;
        } else if (screenSize == 15.0) {
            total += 300;
        } else if (screenSize == 17.3) {
            total += 400;
        }

        switch (cpuType) {
            case "i3" -> total += 150;
            case "i5" -> total += 250;
            case "i7" -> total += 350;
        }

        total += ramPrice;

        if (storageType.equals("HDD")) {
            total += (storagePrice * 50);
        } else if (storageType.equals("SSD")) {
            total += (storagePrice * 100);
        }
        if (screenResolution.equals("4K")) {
            total += 200;
        } else if (screenResolution.equals("FULLHD")) {
            total += 100;

        }

        System.out.println("Final price is: $" + total);
    }

}
