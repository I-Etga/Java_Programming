package daily_videos.day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        // Object Class is the parent Class of all Classes. So, I can use any data type as value !!
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur"); // <String , String>
        person1.put("gender", 'M');// <String , char>
        person1.put("age", 32);// <String , int>
        person1.put("job_title", "Developer"); // <String , String>
        person1.put("salary", 100000.5);// <String , double>
        person1.put("married", true);// <String , boolean>

        System.out.println(person1);

        //every single is unique. So those keys serve as index number .get(key)!!

        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job_title"));


    }


}
