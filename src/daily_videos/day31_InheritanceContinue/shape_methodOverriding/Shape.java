package daily_videos.day31_InheritanceContinue.shape_methodOverriding;

public class Shape {  // It's going to be the parent class of Circle,Square,Rectangle ...

    private String name;

    public Shape() {
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area() {
        return 0; // I pass default value. In child/sub class I'll override it !!
    }

    public double perimeter() {
        return 0;  // I pass default value. In child/sub class I'll override it !!
    }

    public void draw() {
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    public String toString() { // toSting method overridden from -> Object Class <-- which is the parent Class of all classes !!
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
