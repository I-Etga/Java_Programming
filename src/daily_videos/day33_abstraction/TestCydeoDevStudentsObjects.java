package daily_videos.day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentsObjects {

    public static void main(String[] args) {
        CydeoDevStudent student1 = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1989, 11, 1), "A1", "Alumni Dev", 2);

        System.out.println(student1);

        //CydeoDevStudent student2 = new CydeoDevStudent("Daniel",'M', LocalDate.of(2008,11,1),"A1","Alumni Dev",2);
        //                                          err: Cydeo Student must be at least 18 years old

        //CydeoDevStudent student3 = new CydeoDevStudent("Daniel",'M', LocalDate.of(1989,11,1),"A1","Zero to negative",2);
        //                                                              err: invalid batch name

        //CydeoDevStudent student4 = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1989, 11, 1), "A1", "Alumni Dev", -5);
        //                                                                                                              err: invalid batch number

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath(); // final method. It can't be overridden !! there is any different implementation on that final method.

    }

}
