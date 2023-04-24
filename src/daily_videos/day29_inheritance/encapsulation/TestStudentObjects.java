package daily_videos.day29_inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Monica",28,'F','A',"Master Chefs");

       // student1.setAge(98); -> I get error and program gets terminated !

        //student1.name = "Rachel"; --> this variable is private.Only way to set it is setter !!


    }
}

/*
access modifiers with inheritance

	private: cannot be inherited [only allowed with getter and setter methods !!!]

	default: can only be inherited within the same package

	protected: can inherit the fields to the subclass no matter if its in the same package or not

	public: can inherit anywhere in the project
 */