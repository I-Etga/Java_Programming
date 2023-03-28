package studyGroup;

import java.util.Arrays;

public class ArrayIntro1 {

    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        String[] brands = new String[10];
        // null
        brands[0] = "Apple";
        brands[1] = "Samsung";
        System.out.println(Arrays.toString(brands));
        System.out.println(brands[0]);

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("index of \"Gloves\": " + i);
            }
            if (items[i].contains("iPad")) {
                System.out.println("Array contains iPad");
            }
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println("name: " + items[i] + "-" + "price: " + prices[i] + "-" + "ID: " + itemIDs[i]);
        }
    }
}




        /*
        3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */