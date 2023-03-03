package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1-5: ");
        int number = scanner.nextInt();

        String sentence = "";

        boolean isOne = number == 1;
        boolean isTwo = number == 2;
        boolean isThree = number == 3;
        boolean isFour = number == 4;
        boolean isFive = number == 5;

        if (isOne){
            sentence = "Hello, thanks for your call.";
        } else if (isTwo) {
            sentence = "Hola, gracias para llamar.";
        } else if (isThree) {
            sentence = "Merhaba, aradığınız için teşekkürler.";
        } else if (isFour) {
            sentence = "Privet, spasibo za vash zvonok.";
        } else if (isFive) {
            sentence = "Merci, pour votre appel.";
        }else{
            sentence = "Invalid number. Please enter a number between 1-5";
        }
        System.out.println(sentence);
    }
}
