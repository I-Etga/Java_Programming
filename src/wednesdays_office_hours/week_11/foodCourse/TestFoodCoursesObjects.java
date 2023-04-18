package wednesdays_office_hours.week_11.foodCourse;

import wednesdays_office_hours.week_11.foodCourse.entree.*;

public class TestFoodCoursesObjects {

    public static void main(String[] args) {
        Cake cake = new Cake("Cheese Cake", 5, "lime");
        cake.inOwen();
        System.out.println(cake);

        Cookies cookies = new Cookies("American", 3, 4);
        cookies.setPrice(6);
        System.out.println(cookies);

        IceCream iceCream = new IceCream("Italian", 10, true);
        iceCream.inACone();
        System.out.println(iceCream);

        Entree entree = new Entree("France", 12);
        System.out.println(entree);

        BreadStick breadStick = new BreadStick("Garlic", 5, false);
        breadStick.glutenFree();
        breadStick.setHasGluten(true);
        System.out.println(breadStick);

        CheeseStick cheeseStick = new CheeseStick("Mozzarella", 9, 14);
        cheeseStick.stick();
        System.out.println(cheeseStick);

        Fish fish = new Fish("Fish", 10, "Tuna");
        fish.season();
        System.out.println(fish);

        Gyro gyro = new Gyro("Greek", 6, 1.5);
        gyro.portion();
        System.out.println(gyro);

        Pasta pasta = new Pasta("Italian", 16, true);
        pasta.orderPasta();
        pasta.setWithTomatoSauce(false);
        System.out.println(pasta);

        Shrimp shrimp = new Shrimp("Garnela", 10, 'L');
        shrimp.shrimps();
        System.out.println(shrimp);

        Steak steak = new Steak("Turkish", 25, "well done");
        steak.cookLevel();
        steak.setCookLevel("Medium rare");
        System.out.println(steak);

        Taco taco = new Taco("Mexican", 6, "Ground Meat");
        taco.loveTaco();
        taco.setName("Brazilian");

        System.out.println(taco);

    }
}
