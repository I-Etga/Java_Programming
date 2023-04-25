package daily_videos.day31_InheritanceContinue.tasks.studentTask;

public class Student extends Person {
    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(studentId);
        setSchoolName(studentId);
        setGender(gender);
    }

    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty()) {
            this.fieldOfStudy = fieldOfStudy;
        } else {
            System.err.println("Invalid field of study. It can not be empty or null");
            System.exit(1);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        if (schoolName.isEmpty()) {
            this.schoolName = schoolName;
        } else {
            System.out.println("Invalid name. School name can not be empty or null");
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        char[] grades = {'A', 'B', 'C', 'D', 'F'};

        for (char c : grades) {
            if (grade == c) {
                this.grade = grade;
            } else {
                System.err.println("Invalid grade. Grade can only be A, B, C, D, F ");
                System.exit(1);
            }
        }
    }

    public void study() {
        System.out.println(getName() + " is studying...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name'" + getName() + '\'' +
                "age'" + getAge() + '\'' +
                "gender'" + getGender() + '\'' +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
