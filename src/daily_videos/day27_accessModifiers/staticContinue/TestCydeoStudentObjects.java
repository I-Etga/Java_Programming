package daily_videos.day27_accessModifiers.staticContinue;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);
        CydeoStudent student1 = new CydeoStudent("Katerina", 29, 'F');
        CydeoStudent student2 = new CydeoStudent("Alena", 28, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);
    }
}
