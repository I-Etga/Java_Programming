package daily_videos.day33_abstraction;

import daily_videos.day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id; // final is unchangeable -> So we can NOT generate set method.

    // final keyword -> they do not have default value !! And any final variable has to be instantiated before use it!

    private String batchName;

    private int batchNumber;

    public static final String programmingLanguage;
    // final keyword -> they do not have default value !! And any final variable has to be instantiated before use it!
    static {
        programmingLanguage = "Java";
    }

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);

        // if age is set to less than 18, the object won't be created !! prevents constructor
        // final variable can't have set method. That's why we put the conditions inside constructor !!
        if (getAge() < 18) {
            System.err.println("Cydeo Student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        } else {// otherwise: if the batch name is invalid
            System.err.println("Invalid batch name");
            System.exit(1);
        }

    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("Invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage); // We can use it static variables in instances methods.
    }

    @Override // access modifier must be same or less restrictive. // private can be-> default,protected,public. Public can be only public
    public void sleep() {
        System.out.println(getName() + " does not need to sleep");
    }
   /*
    Why does final keyword gray color ? -> When you apply the final keyword on a method, it prevents the method to be overridden.
     Our CLASS is also FINAL and NEVER have SUBclass. So there is no point of final method !!

     I still get compiler error. Because breath() method is final method in the parent class and can not be overriden !!


      public final void breath() { // to make sure that this implementation will not change for any sub class
        System.out.println(getName() + " is breathing");
    }
     */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id +'\'' +
                ", batchName='" + batchName +'\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
