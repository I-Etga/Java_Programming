package sundays_live_sessions.week6;

public class ItemTest {
    public static void main(String[] args) {
        Item item1 = new Item();

        item1.setInfo("Macbook Air M2",35,1500);
        System.out.println(item1.toString());
        item1.sellItem(4);
        System.out.println("current in stock " +item1.toString());

        System.out.println("******************");

        Item item2 = new Item();

        item2.name = "Macbook Pro m2";
        item2.unitPrice = 1700;
        item2.quantity = 12;
        System.out.println(item2.name + " in stock: " + item2.quantity);
        item2.sellItem(9);

        System.out.println("current in stock "+item2.toString());
    }
}
