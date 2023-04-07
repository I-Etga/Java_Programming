package daily_videos.day26_statics.studentTask;

public class TestObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Yusuf", 21, 'M', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);

        /*
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        */

        group1.addStudent(student1); // #1 adding student

        Student[] students = {student2, student3, student4, student5};
        group1.addStudent(students); // #2 (Array)

        group1.addStudent("Rachel Green", 29, 'F', "F45"); //#3 with infos

        System.out.println(group1); // number of student = 6

        group1.removeStudent("F45");
        group1.removeStudent("C56");
        System.out.println(group1); // number of student = 4


        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
        }

        System.out.println("*****");

        StudentsGroup group2 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group3 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group4 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup[] groups = {group1, group2, group3, group4};
    }

}
