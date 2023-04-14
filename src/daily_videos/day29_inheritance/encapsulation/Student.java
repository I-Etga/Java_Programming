package daily_videos.day29_inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
       setName(name);
       setAge(age);
       setGender(gender);
       setGrade(grade);
       setSchoolName(schoolName);
    }

    /*
            Getter:
            -It must be public
            -Return type must be match with the variable getter gets
            -no parameters !!
         */
    public String getName() { // READ ONLY
        return name;
    }

    /*
     Getter:
     -It must be public
     -Return type must be VOID !
     -parameter type must be match with the variable setter sets
     -new value as argument !!
  */
    public void setName(String name) { // WRITE ONLY

        if (name.isEmpty()) {
            System.err.println("Invalid student name");
            System.exit(1);  // because of that if block and exit statement,if given value is invalid, setter can't set the variable.
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            System.err.println("Age can not be negative");
            System.exit(1);
        }

        if (age < 5 || age > 90) {
            System.err.println("Invalid student age");
            System.out.println("Age can not be less than 5 and more than 90");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.err.println("Gender can be only M of F");
            System.exit(1);
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        if (isValid) {
            this.grade = grade;
        } else {
            System.err.println("Invalid grade" + grade);
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
