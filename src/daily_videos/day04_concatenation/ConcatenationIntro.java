package daily_videos.day04_concatenation;

public class ConcatenationIntro {

    public static void main(String[] args) {
        String name = "Daniel";

        int age = 45;

        int salary = 85_000; // underscore DOES NOT AFFECT the code. It just makes that more readable.


        System.out.println("Hallo " + name + ".");

        System.out.println("You are " + age + " years old.");

        System.out.println("Your salary is " + "$" + salary);
    }
}
