package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

public interface Flyable {

    boolean canFly = true; // static & final by default [There is no another option ]

     void fly(); // abstract &public by default [We can create static[can be private ] , default, abstract methods.]
}
