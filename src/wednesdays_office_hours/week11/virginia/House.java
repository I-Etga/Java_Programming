package wednesdays_office_hours.week11.virginia;

public class House {

    public String address;
    protected double price;
    String neighborhoodName;
    private String ownerName;

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", price=" + price +
                ", neighborhoodName='" + neighborhoodName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public static void main(String[] args) {

         /*
                    IN the SAME SAME
                public √
                protected √
                default √
                private √
         */

        House house = new House();
        // IN THE SAME CLASS all variables are accessible !!
        house.address = "Frankfurt 67832";  //public
        house.price = 1900; //protected
        house.neighborhoodName = "Ross Johnson"; //default
        house.ownerName = "Burcu Kirec"; // private

        System.out.println(house);
    }
}

/*
            ACCESS MODIFIER
                            (in the same) -class  /   -directory  /   -subclass   /   -world
            public                          √           √                  √            √
            protected                       √           √                  √            X
            default                         √           √                  X            X
            private                         √           X                  X            X
 */