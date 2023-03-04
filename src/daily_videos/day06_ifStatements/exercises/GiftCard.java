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
        int usbCable = 10;

        String result = "Thank you for your purchase!\nYour current balance is: $";

        if (item.equals("laptop") || item.equals("smartphone")) {
            result = "Sorry, not enough funds on your gift card";
        } else if (item.equals("blanket") || item.equals("charger")
                || item.equals("hat") || item.equals("headphones")
                || item.equals("panths") || item.equals("pillow")
                || item.equals("socks") || item.equals("usb cable")) {

            switch (item) {
                case "blanket":
                    result += ((balance - blanket) + "$");
                    break;
                case "charger":
                    result += ((balance - charger) + "$");
                    break;
                case "hat":
                    result += ((balance - hat) + "$");
                    break;
                case "headphones":
                    result += ((balance - headphones) + "$");
                    break;
                case "panths":
                    result += ((balance - panths) + "$");
                    break;
                case "pillow":
                    result += ((balance - pillow) + "$");
                    break;
                case "socks":
                    result += ((balance - socks) + "$");
                    break;
                default:
                    result += ((balance - usbCable) + "$");
            }
        } else {
            result = "Sorry, that is an invalid item";
        }
        System.out.print(result);
    }

}
