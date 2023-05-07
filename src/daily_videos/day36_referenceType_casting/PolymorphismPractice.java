package daily_videos.day36_referenceType_casting;

import daily_videos.day30_inheritanceContinue.phoneTask.*;
import daily_videos.day30_inheritanceContinue.phoneTask.IPhone;

public class PolymorphismPractice {

    @Override
    public boolean equals(Object obj) { // It comes from object class . equals() method
        return super.equals(obj);
    }

    public static void main(String[] args) {

        // it's not polymorphism. Child can not reference to parent class object.
        //IPhone phone = new Phone("Iphone 11 Pro", "Large", "Black", 900);

        //However, parent class can reference to all child classes objects.
        Phone phone = new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200);

        Phone phone1 = new Samsung("Galaxy S19", "Medium", "Pink", 700);

        Phone phone2 = new Nokia("G50", "Large", "Silver", 250);


        Phone[] phones = {

                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Small", "Gold", 400),
                new IPhone("Iphone 7", "Small", "White", 500)
        };


        // model - color - price
        for (Phone eachPhone : phones) { // reference type must be parent class
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        System.out.println("---------------------------------------------------------");

        int countIphone = 0;
        int countSamsung = 0;

        for (Phone each : phones) {

            if (each instanceof IPhone) { // if the phone is Iphone
                countIphone++;
            }

            if (each instanceof Samsung) { // if the phone is samsung
                countSamsung++;
            }

        }

        System.out.println(countIphone);
        System.out.println(countSamsung);


        System.out.println("---------------------------------------------------------");

        for (Phone each : phones) {
            if (each instanceof IPhone || each instanceof Samsung) { // if the phone is Iphone or samsung
                if (each.getPrice() >= 700) {
                    System.out.println(each.getModel());
                }
            }
        }


        // ==,  .equals() look at line 8!!


    }

}

