package daily_videos.day17_customClass.practice;

public class Student {
    public String name;
    public char gender;
    public int age ;
    public long studentId;
    public int grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, long studentId, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }
    public String toStringStudent() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void study(){
        System.out.println(name + " is studying now");
    }
}
