package sundays_live_sessions.week10.trafficLight;

public class TestTrafficLightsObjects {
    public static void main(String[] args) {
        TrafficLight obj1 = new TrafficLight("green");

        System.out.println(obj1); // TrafficLight{color='green'}

        //TrafficLight obj2 = new TrafficLight("orange"); [Constructor contains setter method. So we can set directly. Also, it checks the condition/s]
        // we get that error: Color only can be one of those color: green, red , yellow . And program gets terminated.


        obj1.setColor("red");
        System.out.println(obj1); // TrafficLight{color='red'}

        System.out.println(new TrafficLight("hello").getColor());  // creating an object without a reference and accessing the colors getter
    }
}
