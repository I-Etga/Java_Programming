package daily_videos.day28_encapsulation.student;

public class Student {

    private String name;

    //public int age; -> public, so no control over it.
    private int age;  // only internal member can change it


    public int getAge() { // basically read

        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1); // process finished with no problem code 0 , process finished because of something wrong code 1
        }
        return age;
    }

    public String getName() {

        if (name == null) { // == operator checks if it exists or not. Null is no object so we don't use string methods.
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit) {
            System.err.println("Invalid Name: " + name);
        }
        this.name = name;
    }

    public void setAge(int age) { //basically write
        if (age < 1 || age > 100) {
            System.err.println("Invalid age: " + age);
            //return; exiting the method
            System.exit(1); // it terminates the program
        }

        this.age = age;
    }
}
