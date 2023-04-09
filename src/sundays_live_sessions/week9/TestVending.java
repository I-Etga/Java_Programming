package sundays_live_sessions.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class TestVending {
    public static void main(String[] args) {
        DrinksVending drinksVending = new DrinksVending(new ArrayList<Drink>(Arrays.asList(new Drink("Pepsi", 1.25, 5),
                new Drink("Coca Cola", 1.25, 12),
                new Drink("Ice Tea", 1, 0),
                new Drink("Nescafe Express", 0.90, 10),
                new Drink("Redbull", 1.59, 2)
        )));


        drinksVending.stock(new ArrayList<Drink>(Arrays.asList(new Drink("Coca Cola Zero", 1.25, 30),
                new Drink("Pepsi Max", 1.25, 20))));

        System.out.println(drinksVending);

        drinksVending.vend("Pepsi"); // quantity of pepsi -1
        drinksVending.vend("Pepsi");
        drinksVending.vend("Pepsi");
        drinksVending.vend("Pepsi");
        drinksVending.vend("Coca Cola"); // quantity of coca cola -1
        drinksVending.vend("Coca Cola");
        drinksVending.vend("Coca Cola");
        drinksVending.vend("Ice Tea"); // quantity of ice tea 0. no stock
        drinksVending.vend("Ice Tea");
        drinksVending.vend("Cola Turka"); // not offered

        System.out.println(drinksVending);

    }
}
