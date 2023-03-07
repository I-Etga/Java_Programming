package daily_videos.day12_CustomMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Split or No split ?(Yes or No)");
        String yesNo = scanner.next().toLowerCase();

        System.out.println("Enter the check amount: ");
        double amount = scanner.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scanner.next().toLowerCase();

        double totalTip = (service.equals("excellent"))?amount*0.25
                :(service.equals("great"))?amount*0.2
                :(service.equals("good"))?amount*0.15
                :(service.equals("fair"))?amount*0.10
                :amount*0.05;

        double totalToPay = amount + totalTip;
        String message = "";




        switch (yesNo){
            case "yes":
                System.out.println("Enter the number of People: ");
                int numberOfPeople = scanner.nextInt();

                message = "Number of people entered: "+ numberOfPeople+
                            "\nTotal to pay: "+ totalToPay+
                            "\nTotal tip: " + totalTip +
                            "\nTotal for each person: " + totalToPay/numberOfPeople +
                            "\nTip per person: " + totalTip/numberOfPeople;
                break;
            default:
                message = "Total amount: " + totalToPay+
                        "\nTotal tip: " + totalTip;
        }

        System.out.println(message);
        scanner.close();

    }
}
