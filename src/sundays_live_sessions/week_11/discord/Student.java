package sundays_live_sessions.week_11.discord;

import java.time.LocalDate;

public class Student extends DiscordUser {
    public Student(String role, String name, String id, LocalDate accountCreateDate) {
        super(role, name, id, accountCreateDate);
    }

    public void sendMessage(String name) {
        System.out.println("Sending message to " + name);
    }

}
/*
    Create a class Student

        - Student class inherits DiscordUser class

        - create constructor to call parent constructor and set up variables (role - Student, name, id)

        - overload the sendMessage(String name) to accept a String for the chat name
            print Sending message to $name

 */

