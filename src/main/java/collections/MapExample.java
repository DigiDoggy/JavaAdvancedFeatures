package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        //Add values to map
        map.put("Bob",900);
        map.put("John",920);
       // map.put("John",1000);

        System.out.println(map);

        //Get value from key
        System.out.println("John`s salary: " + map.get("John"));

        // All key values
        System.out.println(map.keySet() );

        // Size
        System.out.println(map.size());

        // Check if map contains key
        System.out.println(map.containsKey("Tony"));
        System.out.println(map.containsKey("John"));
        System.out.println();

        //Check if map contains value
        System.out.println(map.containsValue(1000));
        System.out.println(map.containsValue(900));
        System.out.println();

        //Remove value/key pair from map
        map.remove("Bob");
        System.out.println(map);
        System.out.println();

        //Example

        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Finland", "Helsinki");

        System.out.println(capitalCity.get("Finland"));
        System.out.println();
        for (Map.Entry<String, String>entry: capitalCity.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }


    }
}
