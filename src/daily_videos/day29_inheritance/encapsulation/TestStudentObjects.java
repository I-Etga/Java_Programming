package daily_videos.day29_inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Monica",28,'F','A',"Master Chefs");

       // student1.setAge(98); -> I get error and program gets terminated !

        //student1.name = "Rachel"; --> this variable is private.Only way to set it is setter !!


    }
}