package daily_videos.day27_accessModifiers.tasks.cydeoStudent;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int groupNumber;
    public String fieldOfStudy;
    public String programmingLanguage;


    public static String schoolName;
    public static String secretCode;

    static {
        schoolName = "Cydeo School";
        secretCode = "Future Software Engineer";
    }

    public CydeoStudent(String name, char gender, int age, int groupNumber, String fieldOfStudy, String programmingLanguage) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
    }

    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printSecretCode() {
        System.out.println(secretCode);
    }

    public void attendClass() {
        System.out.println(name + " is attending class");
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", secretCode='" + secretCode + '\'' +
                '}';
    }
}
