package wednesdays_office_hours.week_11.virginia;

public class TestAccessOfHouseVariables {
    public static void main(String[] args) {
         /*
                    IN DIFFERENT CLASS & IN THE SAME DIRECTORY
                public √
                protected √
                default √
                private X
         */

        House house = new House();

        house.address = "Ankara 06234"; // address is public. --> in other class&in the same directory √
        house.price = 9000; // price is protected. --> in other class&in the same directory √
        house.neighborhoodName = "Hatice Nizar"; // neighborhoodName is default.--> in other class&in the same directory √


        // house.ownerName; --> we can't access ownerName variables. Because it's private.
    }
}
