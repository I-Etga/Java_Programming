package daily_videos.day12_customMethods.practice;

public class EmailTask {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String first = email.substring(0, email.indexOf("_"));
        String last = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(last + "_" + first + "@" + domain);


    }
}
