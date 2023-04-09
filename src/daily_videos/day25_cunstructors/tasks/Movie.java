package daily_videos.day25_cunstructors.tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;

    public Movie(String country, String title, String director, String genre, LocalDate releaseDate, ArrayList<String> casts) {
        this.country = country;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.casts = casts;
    }

    public void addCast(String name) {
        casts.add(name);
    }

    public void addCasts(String[] names) {
        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", cast=" + casts +
                ", total number of casts=" + casts.size() +
                '}';
    }
}

