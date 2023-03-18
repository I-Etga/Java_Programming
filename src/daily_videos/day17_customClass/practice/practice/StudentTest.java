package daily_videos.day17_customClass.practice.practice;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setInfo("Jim Klein",'M',26,167,2,true);

        System.out.println(student.toString());
    }
}
