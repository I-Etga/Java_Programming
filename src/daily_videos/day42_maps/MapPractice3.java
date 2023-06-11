package daily_videos.day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);


        /*
        What should be the data type of Array?
        Object ? --> We can use it, that way we can't access map methods directly.
        So, I should be more specific. I use Map as data type of Array !!

        Data type of Array decides what kind of object can be store in the Array.
         */

        //    String [] strings = new String[]; Remember how to create an array !!
        Map<String, Object>[] arrayOfMap = new Map[5]; // index: 0 ~ 4
        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;
        arrayOfMap[4] = person5;
        // arrayOfMap[5] = new LinkedHashMap<>();

        //arrayOfMap[1].get(key) --> returns Object. So I have to downcast in order to increase by any integer/double
        arrayOfMap[1].replace("salary", ((Integer) arrayOfMap[1].get("salary")) + 10000);


        arrayOfMap[0].replace("name", "Hasan");

        System.out.println(Arrays.toString(arrayOfMap));

        System.out.println("***** *****");
        int count = 0;
        for (
                Map<String, Object> eachMap : arrayOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("salary")) {
                    double salary = (Double) eachEntry.getValue();
                    //String < 10000 ~ Object < 10000 [can NOT be compared]
                    if (salary < 100000) {
                        count++;
                    }
                }
            }
        }


        System.out.println(count);
    }

}
