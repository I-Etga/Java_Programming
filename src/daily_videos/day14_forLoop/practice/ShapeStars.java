package daily_videos.day14_forLoop.practice;

import java.util.Scanner;

public class ShapeStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a char: ");
        String str = scanner.next();
        eightTimes(str);

            /*
                if I need user input only once I'd better use;
                  eightTimes(new Scanner(System.in).next());
            */
    }

    public static void eightTimes(String str) {
        for (int i = 1; i <= 8; i++) {
            System.out.println(str.repeat(6));
        }
    }
}
