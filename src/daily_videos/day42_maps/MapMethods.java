package daily_videos.day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();// new memory in heap
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");


        Map<String, String> employees = new TreeMap<>();// new memory in heap
        employees.putAll(map);

        System.out.println(employees);

        System.out.println(map == employees); // false [It's about the memory allocation]

        // If you want to compare maps, you need to use .equals() method
        // Pairs and order must be same to return true
        System.out.println(map.equals(employees)); // true


    }
}
