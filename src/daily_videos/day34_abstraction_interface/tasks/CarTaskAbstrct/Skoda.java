package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

public class Skoda implements AutoPark {

    // !! A Class does NOT have to extend a class in order to implement interfaces !!

    @Override
    public void autoPark() {
        System.out.println(getClass().getSimpleName() + " has auto park feature");
    }
}
