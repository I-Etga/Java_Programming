package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

import java.time.LocalDate;

public class CarShop {
    public static void main(String[] args) {


      /*
            # Interfaces are not Class. So they can't be instantiated !! no object
                Autopark autopark = new Autopark();
                AutoPilot autoPilot = new AutoPilot();
                Fylable fylable = new Fylable();

                                */
        //Car car = new Car();
        // -> Abstract class can not be instantiated [no object] !!
        // Abstract class is meant to be parent/super class.However, it can be subclass as well.


        Audi audi = new Audi("Audi", "a3", 38000, "White", LocalDate.of(2022, 1, 1));
        audi.autoPark(); // inherited from Autopark interface
        System.out.println(Audi.hasAutoPark); //variables in interface is static&final by default !!
        audi.start(); // inherited from parent abstract Class named Car
        audi.drive();// inherited from parent abstract Class named Car
        audi.stop();// inherited from parent abstract Class named Car
        audi.setColor("Black"); // Car class has set methods for only color and price. Other variables are final!!
        System.out.println(audi.getPrice());// inherited from parent abstract Class named Car


        BMW bmw = new BMW("BWM", "m3", 45000, "Green", LocalDate.of(2023, 1, 1));
        bmw.autoPark();
        System.out.println(BMW.hasAutoPark); //variables in interface is static&final by default !!
        bmw.start();
        bmw.drive();
        bmw.stop();
        bmw.setColor("Yellow");
        System.out.println(bmw.getYear());



        CydeoCar cydeoCar = new CydeoCar("Cydeo", "CydeoCar", 80000, "Purple", LocalDate.of(2023, 4, 4));
        cydeoCar.fly(); // Flyable interface
        System.out.println(CydeoCar.canFly);//variables in interface is static&final by default !!

        cydeoCar.autoPark();// Autopilot -> inherited from AutoPark interface
        System.out.println(CydeoCar.hasAutoPark);//variables in interface is static&final by default !!

        cydeoCar.selfDrive(); // Autopilot interface

        cydeoCar.start(); // Car class [parent]
        cydeoCar.drive();// Car class [parent]
        cydeoCar.stop();// Car class [parent]
        System.out.println(cydeoCar.getYear());// Car class [parent]
        cydeoCar.setPrice(65000);// Car class [parent]

        Honda honda = new Honda("Honda", "Civic", 28000, "Gray", LocalDate.of(2021, 1, 1));
        honda.autoPark();
        System.out.println(Honda.hasAutoPark); //variables in interface is static&final by default !!
        honda.start();
        honda.stop();
        honda.drive();
        honda.setColor("White");
        System.out.println(honda.getPrice());

        Mercedes mercedes = new Mercedes("Mercedes", "SL550", 140000, "Black", LocalDate.of(2020, 1, 1));
        mercedes.autoPark();
        System.out.println(Mercedes.hasAutoPark);//variables in interface is static&final by default !!
        mercedes.start();
        mercedes.drive();
        mercedes.stop();
        System.out.println(mercedes.getModel());
        mercedes.setPrice(165000);


        Nio nio = new Nio("Nio", "NewX", 90000, "White", LocalDate.of(2023, 1, 1));
        nio.autoPark();
        nio.selfDrive();
        System.out.println(Nio.hasAutoPark); //variables in interface is static&final by default !!
        nio.start();
        nio.stop();
        nio.drive();
        nio.setPrice(88000);
        System.out.println(nio.getMake());

        Tesla tesla = new Tesla("Tesla", "Model Y", 60000, "White", LocalDate.of(2022, 1, 1));
        tesla.autoPark();
        tesla.selfDrive();
        System.out.println(Tesla.hasAutoPark);//variables in interface is static&final by default !!
        tesla.drive();
        tesla.start();
        tesla.stop();
        System.out.println(tesla.getColor());
        tesla.setColor("Gray");

        Toyota toyota = new Toyota("Toyota", "Yaris", 23000, "Red", LocalDate.of(2021, 1, 1));
        toyota.autoPark();
        System.out.println(Toyota.hasAutoPark);
        toyota.start();
        toyota.stop();
        toyota.drive();
        toyota.setColor("White");
        System.out.println(toyota.getModel());

        // We don't have to extend a concrete/abstract class in order to implement an interface
        Skoda skoda = new Skoda();
        skoda.autoPark();
        System.out.println(Skoda.hasAutoPark);
    }
}
