package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

import java.time.LocalDate;

public class Honda extends Car implements Autopark{
    public Honda(String make, String model, double price, String color, LocalDate year) {
        super(make, model, price, color, year);
    }

    /*  Honda public class and can have no abstract method !![no body method]
       ---> So I have to implement abstract methods if I extend an Abstract Class or implement interface/s !!
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
