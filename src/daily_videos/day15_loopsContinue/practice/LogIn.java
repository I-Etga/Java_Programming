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
        String passwordInp= scanner.next();

        int count = 3;
        while (!((username.equals(usernameInp)) && password.equals(passwordInp))){
            count--;
            System.out.println("Incorrect username or password. Try again!\n" + count +" attempts left!");
            if(count == 1){
                System.out.println("Last attempt");
            }if(count == 0){
                System.out.println("Your account is locked !");
            }

            System.out.println("Please enter your username");
            usernameInp = scanner.next();
            System.out.println("Please enter your password");
            passwordInp= scanner.next();
        }
        System.out.println("Logged in ...");
    }
}
