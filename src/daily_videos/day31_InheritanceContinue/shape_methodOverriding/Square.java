package daily_videos.day31_InheritanceContinue.shape_methodOverriding;

final public class Square extends Shape {

    private double side;

    /*
    I don't get any error about the constructor. Because default(NO ARGUMENT)constructor is called implicitly.
    So we just can't see it but constructor of parent class is already called !!
     */
    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * * ");
    }
}
