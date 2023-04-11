package daily_videos.day27_accessModifiers.staticContinue;

public class InstanceBlock {
    {
        System.out.println("Instance Block"); // everytime we create an object, instances block gets executed. We can also here initialize instance variables.
    }
    public InstanceBlock(){
        System.out.println("Costructor");
    }

    public static void main(String[] args) {
        new InstanceBlock();
    }
}
