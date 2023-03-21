package daily_videos.day18_garbageCollection;

class Car{
    public String name;
    public String model;
    public String color;

    /*
    No memory allocation right now.
    It happens only when we create an object !
     */
}

public class MemoryAllocations {
    public static void main(String[] args) {
        int a = 100; // stack
    }

    public static void method1(){
        int b = 200; // stack
    }

    public static void method(){
        String c = "Hello World";
              //stack       heap

        String d = new String("Hello World");
        //stack             heap
    }
}
