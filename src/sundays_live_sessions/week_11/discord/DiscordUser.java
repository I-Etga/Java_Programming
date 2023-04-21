package sundays_live_sessions.week_11.discord;

import java.time.LocalDate;

public class DiscordUser {

    public String role, name, id;
    public LocalDate accountCreateDate;

    public DiscordUser(String role, String name, String id, LocalDate accountCreateDate) {
        this.role = role;
        this.name = name;
        this.id = id;
        this.accountCreateDate = accountCreateDate;
    }

    public void sendMessage() {
        System.out.println("Sending message to class chat");
    }


    public void joinDiscord(String discordUrl) {
        System.out.println("Joining " + discordUrl);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", accountCreateDate=" + accountCreateDate +
                '}';
    }
}

