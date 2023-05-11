package wednesdays_office_hours.week_14.movies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public final class User {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        movies.addAll(Arrays.asList(
                new Movie("Lord of the Rings", 4, 98, 2009),
                new Movie("Harry Potter", 5, 167, 2008),
                new Movie("Die Hard 2", 5, 143, 2012),
                new Movie("John Wick 3", 2, 123, 2022)
        ));
        Movie movie = new Movie("City Of Stars", 5, 145, 2018);
        movies.add(movie);

        Cinema cinema = new Cinema("Mannheim", 8, movies);

        Netflix netflix = new Netflix("www.netlix.com", 3000000, 190);

        Amazon amazon = new Amazon(100000, 110);

        Hulu hulu = new Hulu(130000, 80);


        ArrayList<StreamingSite> streamingSites = new ArrayList<>();
        streamingSites.addAll(Arrays.asList(netflix, amazon, hulu));

        for (StreamingSite site : streamingSites) {
            site.subscribe();
        }

        ArrayList<PlayMovie> playMovies = new ArrayList<>();


    }

    public StreamingSite bestSite(StreamingSite streamingSite) {
        return streamingSite;

    }
}
