package wednesdays_office_hours.week_14.shopping;

public class Warehouse {

    public static void main(String[] args) {
        Target target = new Target();
        target.buyItem();
        target.returnItem();
        target.shipItem();

        System.out.println("-----");

        Amazon amazon = new Amazon();
        amazon.buyItem();
        amazon.returnItem();
        amazon.shipItem();
        amazon.viewCart();

        System.out.println("-----");

        EBay ebay = new EBay();
        ebay.uploadProduct();
        ebay.buyItem();
        ebay.returnItem();
        ebay.shipItem();
        ebay.viewCart();

        System.out.println("-----");

        // # polymorphism # There must be IS A [inheritance relationship] in order to use polymorphism !!]
        // Reference type decides what can be accessible , object type decides which implement will be used !!
        // So, as you can see below, I can only what reference type has, but with implementation of obj type. !!

        //              # UPCASTING
        // ref. type        obj. type
        Shopping shopping = new Amazon();
        shopping.returnItem();
        shopping.buyItem();

        System.out.println("-----");

        Shopping shopping1 = new EBay();
        shopping1.buyItem();
        shopping1.returnItem();

        System.out.println("-----");

        Shopping shopping2 = new Target();
        shopping2.returnItem();
        shopping2.buyItem();

        // ((Amazon)shopping).shipItem();


        System.out.println("-----");

        //If I want to access what obj type has, I have to use downcasting !!
        // Downcasting is done explicitly. So make sure there is 'IS A' relationship. Otherwise, we get an exception !!
        //              #DOWNCASTING

        // through downcasting, I can now access what obj. type has !!

        Amazon amazon1 = (Amazon) shopping;
        amazon1.viewCart();
        amazon1.shipItem();
        amazon1.buyItem();
        amazon1.returnItem();

        System.out.println("-----");

        EBay ebay1 = (EBay) shopping1;
        ebay1.viewCart();
        ebay1.shipItem();
        ebay1.buyItem();
        ebay1.returnItem();
        ebay1.uploadProduct();

        System.out.println("-----");

        Target target1 = (Target) shopping2;
        target1.shipItem();
        target1.buyItem();
        target1.returnItem();

    }

}

