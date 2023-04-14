package daily_videos.day27_accessModifiers.tasks.cydeoStudent;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent = new CydeoStudent("Barney", 'M', 41, 29, "QA Tester", "Java");

        System.out.println(cydeoStudent.name);
        cydeoStudent.age = 29; // instances through obj name [read or write]

        CydeoStudent.schoolName = "CyberTech"; //statics through class name [read or write]
    }
}
