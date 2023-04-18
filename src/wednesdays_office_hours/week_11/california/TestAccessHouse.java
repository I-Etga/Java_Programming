package wednesdays_office_hours.week_11.california;

import wednesdays_office_hours.week_11.virginia.House;

public class TestAccessHouse {
    public static void main(String[] args) {
        /*
                    IN DIFFERENT DIRECTORY
                public √
                protected X
                default X
                private X
         */

        House house = new House();

        house.address = "Ankara 06234"; // We can access it. It's public. --> in other class&in other directory √
        //house.price = 9000; // We can't access !! It's protected. --> in other class&in other directory X
        //house.neighborhoodName = "Hatice Nizar"; // We can't access !! neighborhoodName is default.--> in other class&in the same directory √


        // house.ownerName; --> we can't access ownerName variables. Because it's private.
    }

    /*
            ACCESS MODIFIER
                            (in the same) -class  /   -directory  /   -subclass   /   -world
            public                          √           √                  √            √
            protected                       √           √                  √            X
            default                         √           √                  X            X
            private                         √           X                  X            X
 */
}
