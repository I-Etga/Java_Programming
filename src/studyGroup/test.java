package studyGroup;

import daily_videos.day17_customClass.practice.Student;

public class test {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name ="Ahmet Veli";
        student1.age = 19;

        Student student2 = new Student();

        student2.setInfo("Ali Ka",'M',24,4567893,3,false);

        System.out.println(student2.toString());



    }
}
