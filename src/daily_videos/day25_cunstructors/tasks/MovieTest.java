package daily_videos.day25_cunstructors.tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieTest {
    public static void main(String[] args) {


        Movie movie = new Movie("USA","Braveheart","Mel Gibson",
                "Action/War" ,LocalDate.of(1995,5,18),
                new ArrayList<>()); // DO NOT FORGET  TO CREAT AN OBJECT OF ARRAYLIST !!Otherwise, you get error (there is no object)!!

        movie.addCast("Sophie Marceau");
        movie.addCast("Catherine McCormack");
        movie.addCast("Patrick McGoohan");

        String[] cast1 = {"Angus Macfadyen","Brendan Gleeson","James Robinson"};
        movie.addCasts(cast1);

        System.out.println(movie);
    }
}
