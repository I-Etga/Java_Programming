package sundays_live_sessions.week2;

public class MyName {
    public static void main(String[] args) {

        System.out.println(5 + 3); // int =
        System.out.println(5 + 3 + "hello"); // String =
        System.out.println("java" + 1 + 2);
        System.out.println("java" + (1 + 2)); // parenthesis runs first

        int age = 60;
        String month = "March";
        String str = "In " + month + " you will turn " + age;
        System.out.println(str);

        System.out.println(month + 4 + 1);

        // Task: create a char variable for every character in your name, think about all the ways you can print your name
        System.out.println();
        char first = 'S', second = 'a', third = 'i', fourth = 'm';
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
        System.out.println();

        System.out.println(first + second + third + fourth); // adds the numbers of the characters

        System.out.println("My name is "+ first + second + third + fourth);
        System.out.println("" + first + second + third + fourth);


    }
}
