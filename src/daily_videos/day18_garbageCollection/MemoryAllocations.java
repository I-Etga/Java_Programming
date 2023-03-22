package daily_videos.day18_garbageCollection;

import daily_videos.day03_variables.EmployeeInfo;
import daily_videos.day17_customClass.practice.practice.Student;

class Car{
    public String name;
    public String model;
    public String color;

    /*
    No memory allocation right now.
    It happens only when we create an object !
     */
}

public class MemoryAllocations {
    public static void main(String[] args) {

        int a = 100; // stack
        Car car = new Car();
        // ref :stack heap

        Student student1 = new Student();
        Student student2 = student1; // only one object will be allocated.
        /*
                Basically we have here a room(new Student())
                             with to doors student1 and student2.
                 There is only one object that has been created so far.
         */


        student1.setInfo("Serdar Sen", 'M', 54, 5435, 3, true);

        System.out.println(student1);
        System.out.println(student2);


        System.out.println("***********");

            // in this case we have different objects // disadvantages: memory consumption !!
        String batch1 = new String("Java");
        String batch2 = new String("Java");
        String batch3 = new String("Java");

        // in this case we have only one object with there reference !!

                        //constructor    String literal[always goes string pool]
        String batch4 = new String("Java");
        String batch5 = batch4;
        String batch6 = batch4;

    }



    public static void method1(){
        int b = 200; // stack

    }
    public static void method(){
        String c = "Hello World";
              //stack       heap ( in String pool)

        String d = new String("Hello World");
        //stack             heap(objects always here)
    }
}
