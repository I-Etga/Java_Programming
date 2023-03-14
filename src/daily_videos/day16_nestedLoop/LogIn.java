package daily_videos.day16_nestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String u ,p;

        int attempt = 3;

        do {

            System.out.println("Enter your user name");
            u = scanner.next();
            System.out.println("Enter your password");
            p = scanner.next();
            attempt--;

            if(attempt ==0){
                break;
            }

        }while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));

        /*
        In this case do will run for the first time regardless while !!
         */
    }
}
