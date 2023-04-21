package sundays_live_sessions.week_11.discord;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Admin admin = new Admin("Admin","Ross","B29-234", LocalDate.of(2022,12,31));
        admin.createChannel();
        admin.sendMessage();
        admin.id = "B29-134";


        Student student = new Student("Student","Rachel","B29-54",LocalDate.of(2023,1,10));
        student.sendMessage("Monica");
        student.sendMessage();
        student.joinDiscord("Cydeo B29-Germany");
        student.name = "Joey";
    }
}
