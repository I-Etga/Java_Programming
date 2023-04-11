package daily_videos.day25_cunstructors.tasks.pizza;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('M',3,6);

        System.out.println(pizza1);

        Pizza pizza2 = new Pizza('L', 5,5);

        System.out.println(pizza2);

      /*    with setInfo method(without constructor) [old version]

        Pizza obj3 = new Pizza();
        obj3.setInfo('M',4,3);
   */
    }
}

