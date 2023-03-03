package daily_videos.day11_StringContinue;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first sentence:");
        String firstSentence = scanner.nextLine();
        System.out.println("Please enter your second sentence:");
        String secondSentence = scanner.nextLine();

        scanner.close();

        int numberOfCharSentence1 = firstSentence.length();
        int numberOfCharSentence2 = secondSentence.length();
        boolean sentence1Greater = numberOfCharSentence1 > numberOfCharSentence2;
        String result = "";

        if (firstSentence.equals(secondSentence)) {
            result = "They are equal";
        } else if (sentence1Greater) {
            result = firstSentence;
        } else {
            result = secondSentence;
        }
        System.out.println(result);
    }
}
