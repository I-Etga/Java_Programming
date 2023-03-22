package daily_videos.day18_garbageCollection;

import daily_videos.day17_customClass.practice.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null; // "Java" will be eligible for garbage collection
        // after null s1 is referencing any obj anymore !! // so can NOT  access any instances of object!
        System.out.println(s1);

        // when there is no object, we can NOT call instances as well ! They must be called through the object.
        //System.out.println(s1.toLowerCase()); // we get NullPointerException.

        System.out.println("*************");

             /*
             there is no object, we can NOT call instances. So replace method does not work
        System.out.println(s1.replace(null, "Python"));
              */

        String a = ""; // it's an empty string
        String b = null; // it's not even an object (basically that's something not exist)

        System.out.println("-------------");

        String str1 = "Python";
        str1 = "CYDEO";

        String str2 = "Java";
        str2 = null ;

        // as you can see the values of str1 and str2 were colored gray which means it goes to garbage collection.
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("----------");

        Dog dog1 = new Dog();
        dog1.setInfo("Chuck","Bulldog",'M',"Small",3,"Black");


        Dog dog2 = new Dog();
        dog2.setInfo("Kido","Shiba Inu",'M',"Medium",5,"Orange");

            // [two ways to make dog1 eligible for garbage collection]

        // dog1 = null;
        dog1 = dog2; // as soon as the code get executed , the first value of dog1 goes to garbage collection.

        System.out.println(dog1);
        System.out.println(dog2);
        /*
        Normally I have to call toString method, but Java implicitly[automatically] do them for me !!
                so I write dog1 , instead of dog1.toString();
         */
    }
}
