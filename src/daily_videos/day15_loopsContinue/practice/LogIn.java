package daily_videos.day15_loopsContinue.practice;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "Cydeo";
        String password = "Cydeo123";

        System.out.println("Please enter your username");
        String usernameInp = scanner.next();
        System.out.println("Please enter your password");
        String passwordInp = scanner.next();

        int count = 2;
        //!false                !true
        //     ( true      &&            true)
        while (!((username.equals(usernameInp)) && password.equals(passwordInp))) {
            System.out.println("Incorrect username or password.\n" + count + " attempts left!");

            if (count == 0) {
                System.out.println("Your account is locked !");
                return; // If you use break, cursor jump up the next line after while loop. return or System.exit(1) exit program
            }

            System.out.println("Please enter your username");
            usernameInp = scanner.next();
            System.out.println("Please enter your password");
            passwordInp = scanner.next();
            count--;
        }
        System.out.println("Logged in ...");
    }
}
