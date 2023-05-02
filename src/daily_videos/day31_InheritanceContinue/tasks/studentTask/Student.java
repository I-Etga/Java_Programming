package daily_videos.day31_InheritanceContinue.tasks.studentTask;

public class Student extends Person {
    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(studentId);
        setSchoolName(studentId);
        setGender(gender);
    }

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

/*

    2. Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included



    3. Create the following sub classes of Student class:

                1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary

                2. UndergraduateStudent

                        Override the study method

                        add any additional fields and methods if necessary

                3. CydeoStudent:

                        Extra Variables:
                            batchNumber, groupNumber, programmingLanguage

                        Encapsulate all the fields

                        Add a constructor that can set all the fields

                                Condition:
                                    1. batchNumber and groupNumber should not be set to zero or negative
                                    2. programmingLanguage should not be set to null
                                    3. programmingLanguage should not empty


                        Override the eat, drink and sleep methods (programmingLanguage need to be included)

                        Override the toString method:
                                name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


                4. Create a class named StudentObjects:

                        Create the objects of each sub classes

                        test all the functions of each objects

                        Analyze the relationships between the classes
 */
