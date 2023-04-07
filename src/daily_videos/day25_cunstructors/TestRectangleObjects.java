package daily_videos.day25_cunstructors;

public class TestRectangleObjects {

    public static void main(String[] args) {

    /*
                            setInfo method has disadvantages.
            One of them is that we have to call it every single time we set info of object.
            With constructor, it's done automatically !

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1); //Rectangle{length=0.0, width=0.0, area=0.0}
        rectangle1.setInfo(3,5);
        System.out.println(rectangle1); // Rectangle{length=3.0, width=5.0, area=15.0}

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(4,7);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(1,75;

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(6,4);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(2,7);
        */

        Rectangle rectangle1 = new Rectangle(3,6);
        // the moment object is created , the values will be set automatically.
        // No need to setInfo method !! On the other hand we can't create without passing arguments.


        Rectangle rectangle2 = new Rectangle(4,7);
        Rectangle rectangle3 = new Rectangle(12,9);
        Rectangle rectangle4 = new Rectangle(5,6);
        Rectangle rectangle5 = new Rectangle(3,13);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);

    }
}
