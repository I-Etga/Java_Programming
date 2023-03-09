package daily_videos.day12_CustomMethods;

public class CustomMethodIntro {
    public static void main(String[] args) {

        System.out.println("Test Started");

        greetings();

        System.out.println("Test Completed");
        System.out.println("--------------");
        displayMessage();
    }

    public static void greetings() {

        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java");

    }

    public static void displayMessage() {

        // If the body is empty you won't get anything

        System.out.println("Hello World");
        System.out.println("I love Java");
    }
}
