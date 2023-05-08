package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

public class CydeoCar implements Autopark, AutoPilot, Fylable {

    /*  CydeoCar is a  public class and can have no abstract method !![no body method]
       ---> So I have to implement abstract methods if I extend an Abstract Class or implement interface !!
       Class can implement multiple interfaces
                    */
    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void fly() {

    }
}
