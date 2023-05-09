package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

import java.time.LocalDate;

public class Mercedes extends Car implements AutoPark {
    //A class can extend only one other class, implement any number of interfaces.
    // !! Interface can extend any number of interfaces !!
    public Mercedes(String make, String model, double price, String color, LocalDate year) {
        super(make, model, price, color, year);
    }
    /*  Toyota concrete class and can have no abstract method !![no body method]
       ---> So I have to implement abstract methods if I extend an Abstract Class or implement interface !!
                    */

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void autoPark() {

    }
}
