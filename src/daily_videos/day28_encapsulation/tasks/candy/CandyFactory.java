package daily_videos.day28_encapsulation.tasks.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

        Candy candy1 = new Candy("Ulker", 40, 4, false);
        Candy candy2 = new Candy("Nussknacker", 100, 1, true);
        Candy candy3 = new Candy("Schogetten", 30, 0.80, true);
        Candy candy4 = new Candy("Nutella", 10, 5, true);
        Candy candy5 = new Candy("Piko", 100, 0.24, false);

        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));


        for (Candy each : candies) {
            System.out.println(each);
        }

    }
}
