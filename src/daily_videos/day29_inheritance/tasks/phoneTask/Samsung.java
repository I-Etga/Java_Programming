package daily_videos.day29_inheritance.tasks.phoneTask;

public class Samsung extends Phone_superClass {


    {
        setBrand("Samsung");
    }

    public void freeze() {
        System.out.println(getBrand() + " " + getModel() + " is freezing! ");
    }

}
