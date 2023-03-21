package daily_videos.day18_garbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.size = 'M';
        pizza.numberOfCheeseTopping = 2;
        pizza.numberOfPepperoniTopping = 2;

        System.out.println(pizza.calcCost());
        System.out.println(pizza.toString());

        Pizza pizza2 = new Pizza();

        //pizza2.size = 'L';
        pizza2.setInfo('L', 2, 2);
        System.out.println(pizza2.calcCost());
        System.out.println(pizza2.toString());

        System.out.println(pizza.toString()); // colors gray because it's not necessary
        System.out.println(pizza2);

        /*
            If we don't create toSting method, we get that outputs when we print name our object.
        Pizza@5305068a
        Pizza@28a418fc

            If we have already created toSting method, we get the instance variables as output!!
            Pizza{size=L, numberOfCheeseTopping=2, numberOfPepperoniTopping=2, totalPrice=20.0}
            Pizza{size=M, numberOfCheeseTopping=2, numberOfPepperoniTopping=2, totalPrice=18.0}
         */

        System.out.println("***********");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('S', 2, 2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M', 3, 4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost();

        }
        System.out.println("total = " + total);
    }
}

