package daily_videos.day25_cunstructors.tasks.movie;

import java.time.LocalDate;

public class MovieTest {
    public static void main(String[] args) {


        Movie movie = new Movie("USA", "Braveheart", "Mel Gibson",
                "Action/War", LocalDate.of(1995, 5, 18)); // DO NOT FORGET  TO CREAT AN OBJECT OF ARRAYLIST !!Otherwise, you get error (there is no object)!!

        movie.addCast("Sophie Marceau");
        movie.addCast("Catherine McCormack");
        movie.addCast("Patrick McGoohan");

        String[] cast1 = {"Angus Macfadyen", "Brendan Gleeson", "James Robinson"};
        movie.addCasts(cast1);
        System.out.println(movie);

        System.out.println("*****");

        Movie movie2 = new Movie("USA", "Java Developer: Zero to Hero", "Kuzzat Altay", "Adventure, Comedy, Thriller", LocalDate.of(2021, 4, 18));

        movie2.addCast("Ozzy");
        movie2.addCast("Ali");
        movie2.addCast("Muhtar");


        String[] names2 = {"Ismail", "Hamide", "Yalcin", "Safiye", "Cigdem"};
        movie2.addCasts(names2);

        System.out.println(movie2);
    }
}
