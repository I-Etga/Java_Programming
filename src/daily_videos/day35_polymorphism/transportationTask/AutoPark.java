package daily_videos.day35_polymorphism.transportationTask;

public interface AutoPark {

    /*
     It's final and static by default. That's why if I don't initialize it right away, I get compiler error.
     If it's an abstract class I could use constructor to initialize it but in interfaces there is no constructor.
    So in order to avoid compiler error , I initialize the variable right away.
*/
    boolean hasAutoPark = true;

    void autoPark(); // it's public & abstract method by default.

}
