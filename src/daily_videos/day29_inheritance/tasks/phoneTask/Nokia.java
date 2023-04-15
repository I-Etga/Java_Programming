package daily_videos.day29_inheritance.tasks.phoneTask;

public class Nokia extends Phone {

    {
        setBrand("Nokia");
    }

    public void selfDefence() {
        System.out.println(getBrand() + " " +getModel() + " is self defencing! ");
    }


}