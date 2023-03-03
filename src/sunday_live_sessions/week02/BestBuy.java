package sunday_live_sessions.week02;

public class BestBuy {
    public static void main(String[] args) {
        int tvs = 50;
        System.out.println("Someone comes in a buy a tv");
        //tvs -= 1;
        //tvs = tvs-1;          // all four are the same.
        //tvs--;
        --tvs;                  //because nothing is running in these lines.
        System.out.println("number of tvs is now = " + tvs);

        System.out.println("person 2 came in and bought a tv");
        System.out.println("number of tvs is now = " + --tvs);


        System.out.println("person 3 came in and bought a tv");
        System.out.println("how many tvs are still in the store: = " + tvs--);
        System.out.println("they left,how many left in the store: = " + tvs);
                            // because of post-decrementation
                                //the value  won't be changed.
    }
}
