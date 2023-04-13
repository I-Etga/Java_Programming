package daily_videos.day28_encapsulation.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        //student.age = -200; // invalid. [I can't change it. Because it's private]

        //System.out.println(student.age); I can't call it directly.Because it's private.


        student.setAge(28);
        System.out.println(student.getAge());

        //student.setAge(-35); // program gets terminated.So the other codes below does not get executed.

        System.out.println(student.getAge());

        System.out.println("Test completed");

        //student.name = "Arron" --> we get error. Because it's private

        //student.getName(); // error: Name has not been set [Because we haven't set the name so far]

        //student.setName("Arron123"); // Invalid Name: Arron123 (gives error. I add condition in set method)
        student.setName("Arron"); // It works and set the name


    }
}
