package sunday_live_sessions.week01;

public class Week01 {

    public static void main(String[] args) {
        System.out.println("Shopping List? \n1)Eggs\n2)Milk\n3)Bread");

        System.out.println("*************");

        System.out.println("Shopping List:");
        System.out.println("1)Eggs");
        System.out.println("2)Milk");
        System.out.println("3)Bread");
        System.out.println("*************");

        System.out.print("Shopping List:");
        System.out.print("1)Eggs");
        System.out.print("2)Milk");
        System.out.print("3)Bread");

        System.out.println("Shopping List? \n\t1)Eggs\n\t2)Milk\n\n\t3)Bread");

        // We can USE escape sequences HOW MANY TIMES we want .


        System.out.println("*******************");


        // DECLARE VARIABLE

                    //declaring the variables
                String brand,processor;
                byte ram;
                int storage, numberOfUsb;
                boolean hasBluetooth, hasWifiCard;
                //assigning the variables
                brand = "HP";
                processor="i7";
                ram = 8;
                storage = 256;
                numberOfUsb = 3;
                hasBluetooth = true;
                hasWifiCard = true;
        System.out.println(brand +"\n"+ processor+"\n"+storage+"\n"+numberOfUsb+"\n"+ "Bluetooth " +hasBluetooth+"\n"+"Wifi "+hasWifiCard );


    }
}
