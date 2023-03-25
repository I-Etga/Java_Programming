package daily_videos.day18_garbageCollection.tasks;

public class Contact {
    String name;
    long phoneNumber;
    String email;
    public void setInfo(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String call() {
        return "Calling " + name + " now";
    }
    public String sendMessage() {
        return "Sending message to " + phoneNumber + " now";
    }
    public String sendEmail() {
        return "Sending email to " + email + " now";
    }
}

