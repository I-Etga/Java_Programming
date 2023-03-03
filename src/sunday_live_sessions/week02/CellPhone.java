package sunday_live_sessions.week02;

public class CellPhone {
    public static void main(String[] args) {
        String brand ,model,color;
        int storage;
        double price ;
        boolean hasCamera ;
        char simType;

        brand = "Apple";
        model = "Iphone X";
        color = "Black";
        price = 1200.99;
        storage = 128;
        hasCamera = true;
        simType = 'A';

        System.out.println("We have a brand new " + model + " from " + brand +
                "\n" + "It comes in the color " + color + " and has " + storage+"GB memory\n"+
                "It has a camera" + hasCamera + " and operates with a " + simType + " type sim\n" +
                "Get your very own " + model + " for only $" + price);

        System.out.println("**********");
                // we can also write it with 4 println method!

        System.out.println("We have a brand new " + model + " from " + brand );
        System.out.println("It comes in the color " + color + " and has " + storage+"GB memory");
        System.out.println("It has a camera" + hasCamera + " and operates with a " + simType + " type sim");
        System.out.println("Get your very own " + model + " for only $" + price );

    }
}
