package daily_videos.day26_statics.tasks.cydeoStudent;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber, groupNumber;
    public char grade;

    public static String schoolName = "Cydeo School";
    public static String magicWord = "Java";

    public CydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");

    }

    public static void printSchoolName() {
        System.out.println("School Name: "+schoolName);
    }

    public static void printProgLanguage() {
        System.out.println("Programming Language: " + magicWord );
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", grade=" + grade +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }
}
