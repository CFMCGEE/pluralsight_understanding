package collection_interfaces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class InterfaceMap {


    public static void main(String[] args) {
    //Map interface
    //What'sInTheMap(key, value) reference variable = newKeyword typeOfMap(HashMap)<inferred>();
    Map<String, Integer> coursesByLanguage = new HashMap<>();
    Map<String, Integer> languageCount = new TreeMap<>();
    Map<String, Integer> languageCount2 = new LinkedHashMap<>();
    //Map Methods
        /*
        .put(inserts both a key and a value)
        .get(takes the key in order to get the value)
        .containsKey(checks to see if the key is contained in the Map)
        .entrySet(returns a Set of the key/value Entries used for iterating)
        .keySet(returns a Set (or Sets) of the keys within the Map)
        .values(returns a List of the values within the Map
        ...and many more
         */

//                       (key, value)
    coursesByLanguage.put("HTML", 5);
    coursesByLanguage.put("CSS", 3);
    coursesByLanguage.put("JavaScript", 20);
//-                  (key, value)
    languageCount.put("Python", 10);
    languageCount.put("HTML", 5);
    languageCount.put("CSS", 3);
    languageCount.put("JavaScript", 20);
//-                   (key, value)
    languageCount2.put("Python", 10);
    languageCount2.put("HTML", 5);
    languageCount2.put("CSS", 3);
    languageCount2.put("JavaScript", 20);

        System.out.println("-------------HASHMAP-----------");

      //Map.Entry = looking for an individual key/value pair
    for(Map.Entry<String, Integer> entry : coursesByLanguage.entrySet()) {
        System.out.format("%d %s courses%n", entry.getValue(), entry.getKey());
    }

        System.out.println("-------------TREEMAP-----------");

    for(Map.Entry<String, Integer> entry : languageCount.entrySet()) {
        System.out.format("%d %s courses%n", entry.getValue(), entry.getKey());
    }

        System.out.println("-------------LINKEDHASHMAP-----------");

        for(Map.Entry<String, Integer> entry : languageCount2.entrySet()) {
            System.out.format("%d %s courses%n", entry.getValue(), entry.getKey());
        }

        System.out.println('\n' + "The languages we teach are: " + coursesByLanguage.keySet());

    int sumCourses = 0;
    for(Integer value : coursesByLanguage.values()) {
        sumCourses += value;
    }
    System.out.println('\n' + "Total course: " + sumCourses);

        System.out.println("-------------SIZE-----------");

                                       //checks the amount of pairs within the Map
    System.out.println(coursesByLanguage.size());



  }


}
