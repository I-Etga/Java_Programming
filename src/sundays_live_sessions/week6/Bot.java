package sundays_live_sessions.week6;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");
        String firstQ = scanner.nextLine();
        firstQ = firstQ.toLowerCase();

        while (!(firstQ.equals("hello") || firstQ.equals("hi") || firstQ.equals("hey"))) {
            System.out.println("Why don't you start by greeting me?");
            firstQ = scanner.nextLine().toLowerCase();
        }

        System.out.println("World :) what a joke ha lol");


        System.out.println("You can ask me the following questions:\nwhat is your age ?\nwho created you ?\nwhat can we talk about ?\nor if you think I'm boring just say \"off\" or \"shutdown\" ");
        firstQ = scanner.nextLine().toLowerCase();

        while (!firstQ.equals("shutdown")) {
            while (!(firstQ.equals("what is your age ?") || firstQ.equals("what is your age")
                    || firstQ.equals("who created you ?") || firstQ.equals("who created you")|| firstQ.equals("what can we talk about ?") || firstQ.equals("what can we talk about")
                    || firstQ.equals("off") || firstQ.equals("shutdown") || firstQ.equals("when did steve jobs die ?") || firstQ.equals("when did steve jobs die")|| firstQ.equals("how much Jeff Bezos has ?")|| firstQ.equals("how much Jeff Bezos has")|| firstQ.equals("what temperature does water boil at ?") ||firstQ.equals("what temperature does water boil at"))) {
                System.out.println("I am basic talking bot. Ask questions I can answer please");
                firstQ = scanner.nextLine();
            }

            while (firstQ.equals("what is your age ?") || firstQ.equals("what is your age")
                    || firstQ.equals("who created you ?") || firstQ.equals("who created you") || firstQ.equals("what can we talk about ?")|| firstQ.equals("what can we talk about")
                    || firstQ.equals("off") || firstQ.equals("when did steve jobs die ?") || firstQ.equals("how much jeff bezos has ?") || firstQ.equals("what temperature does water boil at ?")||firstQ.equals("when did steve jobs die") || firstQ.equals("how much jeff bezos has") || firstQ.equals("what temperature does water boil at")) {

                switch (firstQ) {
                    case "what is your age ?":
                    case "what is your age":
                        System.out.println("I was programmed in March");
                        break;
                    case "who created you ?":
                    case "who created you":
                        System.out.println("I was created by Etga");
                        break;
                    case "what can we talk about ?":
                    case "what can we talk about":
                        System.out.println("You can ask me the following questions:\nwhat is your age ?\nwho created you ?\nIn addition to these, I can tell you when Steve Jobs died, how much Jeff Bezos has or what temperature water boils at. Just ask!");
                        break;
                    case "off":
                        System.out.println("haha you cannot turn me off I am invincible");
                        break;
                    case "when did steve jobs die ?":
                    case "when did steve jobs die":
                        System.out.println("On October 5, 2011");
                        break;
                    case "how much jeff bezos has ?":
                    case "how much jeff bezos has":
                            System.out.println("With a net worth of US$128 billion as of February 2023, Bezos is the third-wealthiest person in the world and was the wealthiest from 2017 to 2021 according to both Bloomberg's Billionaires Index and Forbes.");
                            break;
                    case "what temperature does water boil at ?":
                    case "what temperature does water boil at":
                        System.out.println("Water boils at 100 degrees Celsius at see level");
                        break;
                }
                System.out.println("What is your next question?");
                firstQ = scanner.nextLine().toLowerCase();
            }
        }
        System.out.println("Shutting down ...");
        scanner.close();
        return;
    }
}



