package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, which item would you like?");
        String item = scanner.next().toLowerCase();
        int balance = 100;
        int blanket = 60;
        int charger = 5;
        int hat = 25;
        int headphones = 30;
        int panths = 50;
        int pillow = 40;
        int socks = 5;
        int usaCable = 10;

        String result = "Thank you for your purchase!\nYour current balance is: $";


        switch (item) {
            case "blanket":
                result += (balance - blanket);
                break;
            case "charger":
                result += (balance - charger);
                break;
            case "hat":
                result += (balance - hat);
                break;
            case "headphones":
                result += (balance - headphones);
                break;
            case "panth":
                result += (balance - panths);
                break;
            case "pillow":
                result += (balance - pillow);
                break;
            case "socks":
                result += (balance - socks);
                break;
            default:
                result += (balance - usaCable);
                if (item == "laptop" || item == "smartphone") {
                    result = "Sorry, not enough funds on your gift card";
                } else {
                    result = "Sorry, that is an invalid item";
                }
        }
        System.out.print(result);
    }
}
