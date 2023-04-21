package daily_videos.day31_moreInheritance.shape_methodOverriding;

import utilities.MathUtil;

public class Circle extends Shape {

    public double radius;

    // Constructor of Shape class is called implicitly. Because it has no argument [default] !!
    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // super.area() --> it's 0(default). So I don't want to use it. I just remove it !!
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        super.draw();
        // code fragments that can draw a circle !
        System.out.println("          *         *           ");
        System.out.println("       *                *       ");
        System.out.println("     *                    *     ");
        System.out.println("    *                      *    ");
        System.out.println("    *                      *    ");
        System.out.println("    *                      *    ");
        System.out.println("     *                    *     ");
        System.out.println("       *                *       ");
        System.out.println("          *          *          ");

    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                "radius='" + getRadius() + '\'' +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
