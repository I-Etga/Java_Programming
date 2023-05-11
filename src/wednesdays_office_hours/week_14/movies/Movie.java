package wednesdays_office_hours.week_14.movies;

import java.time.LocalDate;

public final class Movie {
    private String title;
    private int rating;
    private int minutes;
    private int year;

    public Movie(String title, int rating, int minutes, int year) {
        setTitle(title);
        setRating(rating);
        setMinutes(minutes);
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {

        if (rating < 0 || rating > 5) {
            System.err.println("Rating must be 1 and 5");
            System.exit(1);
        }
        this.rating = rating;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", minutes=" + minutes +
                ", year=" + year +
                '}';
    }
}
