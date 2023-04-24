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

