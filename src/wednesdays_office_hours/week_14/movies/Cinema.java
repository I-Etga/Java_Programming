package wednesdays_office_hours.week_14.movies;

import java.util.ArrayList;

public final class Cinema implements PlayMovie {

    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> movies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.movies = new ArrayList<>(movies);
    }

    public String location;
    public int numberOfTheaters;
    public ArrayList<Movie> movies;

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle() + " Starting, please grab your popcorn and turn your phones off");
    }

    public void buyTicket(Movie movie) {
        int price = 0;
        if (movie.getRating() == 5) {
            price = 25;
        } else if (movie.getRating() == 4 || movie.getRating() == 3) {
            price = 20;
        } else {
            price = 15;
        }

        System.out.println("Ticket costs $" + price);
    }

    @Override
    public String toString() {
        return "Location: " + location + " has " + numberOfTheaters + " theaters\nMovies available: " + movies;
    }
}
