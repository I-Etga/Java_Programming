package daily_videos.day34_abstraction_interface.tasks.carTaskAbstrct;

public interface AutoPark {

    boolean hasAutoPark = true; // static & final by default [I have to initialize it before getting executed]

    void autoPark(); //  public & abstract by default // static[public & private(only static)] and default methods can also be created
}
