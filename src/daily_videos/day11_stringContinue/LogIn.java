package daily_videos.day11_stringContinue;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String userName = "Cydeo";
        String password = "192837465K";

        System.out.println("Please enter your username");
        String userNameInput = scanner.next();

        /*
        the username and userNameInput are totally different object.
        -String pool        -outside String pool
        password and passwordInput are also totally different object.
        -String pool        -outside String pool
        I CANNOT use  "=="operator in condition statement. Because it returns always false in such cases.

        That's why we should use .equals() method of String Class to check if they match or not
         */
        System.out.println("Please enter your username");
        String passwordInput = scanner.next();

        scanner.close();

        String result = "";


        if (userName.equals(userNameInput) && password.equals(passwordInput)) {
            result = "You are logged in";
        } else {
            result = "Incorrect username or password";
        }
        System.out.println(result);
    }
}
