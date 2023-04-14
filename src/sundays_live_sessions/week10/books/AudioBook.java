package sundays_live_sessions.week10.books;

public class AudioBook extends Book {
    private String narrator;
    private double duration;

    public void listen() {

    }

    public AudioBook(String narrator, double duration) {
        setNarrator(narrator);
        setDuration(duration);
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}