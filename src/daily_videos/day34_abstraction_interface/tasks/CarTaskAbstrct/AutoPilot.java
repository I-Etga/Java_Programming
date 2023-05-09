package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

public interface AutoPilot extends AutoPark {

    //A class can extend only one other class,
    //As you can see , interface can extend any number of interfaces.

    //  Class extends Class/Abstract Class and Class implements interfaces !!
    // interface extends interface

    void selfDrive(); // public & abstract by default
}
