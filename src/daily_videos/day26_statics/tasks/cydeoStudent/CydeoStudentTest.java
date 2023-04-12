package daily_videos.day26_statics.tasks.cydeoStudent;

import daily_videos.day26_statics.tasks.cydeoStudent.CydeoStudent;

public class CydeoStudentTest {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Matthew",27,'M',601,21,4,'C');
        CydeoStudent cydeoStudent2 = new CydeoStudent("Mathilda",33,'F',592,21,3,'A');

        // instance methods and variables are called through objects name !!
        cydeoStudent1.attendClass();
        cydeoStudent2.attendClass();

        cydeoStudent1.study();
        cydeoStudent2.study();

        // static methods and variables are called through Class name !!
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

    }
}
