package wednesdays_office_hours.week_10.show;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShow {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>(Arrays.asList("english", "spanish")); //<--#1 way -- #2 way new ArrayList<>(Arrays.asList("english","spanish")
        Show showT = new Show("Friends", 9, true, languages);
        Show show1 = new Show("the last of us", 1, false, new ArrayList<>(Arrays.asList("english", "spanish")));
        Show show2 = new Show("game of thrones", 8, true, new ArrayList<>(Arrays.asList("english", "spanish", "german")));
        Show show3 = new Show("family feud", 24, false, new ArrayList<>(Arrays.asList("english")));
        Show show4 = new Show("squid game", 1, false, new ArrayList<>(Arrays.asList("korean", "french", "english", "spanish")));
        Show show5 = new Show("you knock my door", 2, true, new ArrayList<>(Arrays.asList("turkish")));

        //show2.name = "Kurtlar Vadisi";
        show5.audioLanguagesAvailable.add("English"); // We can add change/add/remove instances of object that way!

        System.out.println("-------");

        ArrayList<Show> shows = new ArrayList<>(Arrays.asList(show1, show2, show3, show4, show5));

        ShowTracker showTracker1 = new ShowTracker("Cydeo School", "Wooden Spoon", 5, shows);

        System.out.println(showTracker1);

        showTracker1.trackShow(show2); // it contains. So compiler does nothing !

        Show show6 = new Show("You", 1, false, new ArrayList<>(Arrays.asList("korean", "french", "english", "spanish")));

        showTracker1.trackShow(show6);

        System.out.println(showTracker1); // it didn't contain show6. So it adds shows6 to showTrackers .

        System.out.println();
        System.out.println(showTracker1.trackedShows);


        System.out.println(showTracker1.filter("english")); // it shows the shows has specified language option !
        System.out.println(showTracker1.filter(true)); // I pass true, and it shows only finished shows.[method removes not-finished/ongoing shows from list]

        System.out.println(showTracker1.filterBy(true)); // I pass true, and it shows only finished shows.[method add finished shows to list]

        ShowTracker showTracker4 = new ShowTracker("Sevilay", "CydeoB29", 5, shows);


    }
}
