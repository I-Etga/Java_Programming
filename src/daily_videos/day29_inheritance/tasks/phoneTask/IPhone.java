package daily_videos.day29_inheritance.tasks.phoneTask;

public class IPhone extends Phone {
    {
        setBrand("Apple");
    }

    public void faceTime(long phoneNumber) {
        System.out.println(getModel()+" is face-timing with email "+phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(getModel()+" is face-timing with email "+email);;
    }

}
