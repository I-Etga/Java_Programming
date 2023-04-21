package sundays_live_sessions.week_11.discord;

import java.time.LocalDate;

public class Admin extends DiscordUser {
    public Admin(String role, String name, String id, LocalDate accountCreateDate) {
        super(role, name, id, accountCreateDate);
    }

    public void createChannel() {
        System.out.println("Creating new discord channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement");
    }
}

