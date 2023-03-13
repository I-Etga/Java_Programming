package sundays_live_sessions.week2;

public class BestBuy {
    public static void main(String[] args) {

        int tvs = 50;
        System.out.println("someone comes in a buy a tv");
        // all of these subtract 1:
        //tvs -= 1;
        //tvs = tvs - 1;
        //tvs--;
        --tvs;
        System.out.println("number of tvs is now: " + tvs);

        System.out.println("person 2 came in and bought a tv:");
        System.out.println("number of tvs is now: " + --tvs);

        System.out.println("person 3 came in and put the tv in their cart");
        System.out.println("how many tvs are still in the store: " + tvs--);
        System.out.println("they left, how many left in ths store: " + tvs);

        System.out.println("The store gets a shipment");
        tvs += 10; // tvs = tvs + 10 -> adding 10
        System.out.println(tvs);

    }
}
