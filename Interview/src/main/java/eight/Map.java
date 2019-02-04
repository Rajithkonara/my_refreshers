package eight;

import java.util.HashMap;

/**
 * Created by rajith on 10/19/18.
 */
public class Map {


    static void iterateThroughMap(java.util.Map<?,?> map) {
        map.forEach((k,v) -> System.out.println("key: "+k+" Value: "+v));
    }

    public static void main(String[] args) {

        java.util.Map<String,String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("ASS", "Wshington DC");
        countryCapitalMap.put("England", "London");
        countryCapitalMap.put("France", "Paris");
        Map.iterateThroughMap(countryCapitalMap);
    }

}
