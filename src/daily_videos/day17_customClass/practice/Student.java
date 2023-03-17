package daily_videos.day17_customClass.practice;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public int grade ;
    public boolean isFullTime;


    public void setInfo(String name, char gender, int age, int studentID, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
