package sundays_live_sessions.week6;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shoppingList = "";
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("What would you like to add your shopping List");
            answer = scanner.nextLine();

            shoppingList += answer + "\n";

            System.out.println("Would you like to add another item to your shopping list?");

            answer = scanner.nextLine();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entr. Please enter yes/no:");
                answer = scanner.nextLine();
            }

        }
        System.out.println("Shopping List:\n"+ shoppingList);

    }
}
