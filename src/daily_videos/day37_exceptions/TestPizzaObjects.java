package daily_videos.day37_exceptions;

import daily_videos.day36_referenceType_casting.Circle;

public class TestPizzaObjects {

    public static void main(String[] args) {

        /*
        Don't forget:
        Reference type decides what can be accessible !!
        Object type decides which implementation methods has.
                */

        Pizza pizza1 = new Pizza('S', 2, 3);

        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2); // it's about the memory !!

        System.out.println(pizza1.equals(pizza2));


        Object obj = new Pizza('S', 4, 3); //upcasting

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total = ((Pizza) obj).calcCost();

        System.out.println(total);

        double area = ((Circle) obj).area();

        //   System.out.println(area);

        System.out.println("Test Completed");

    }
}
