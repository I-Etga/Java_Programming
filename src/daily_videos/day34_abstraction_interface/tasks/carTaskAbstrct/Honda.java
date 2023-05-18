package daily_videos.day34_abstraction_interface.tasks.carTaskAbstrct;

import java.time.LocalDate;

public class Honda extends Car implements AutoPark {
    public Honda(String make, String model, double price, String color, LocalDate year) {
        super(make, model, price, color, year);
    }

    /*  Honda concrete class and can have no abstract method !![no body method]
       ---> So I have to implement abstract methods if I extend an Abstract Class or implement interface/s !!
                       */

    @Override
    public void autoPark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
