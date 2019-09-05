package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(2, "Gaurav");
        hm.put(1, "A Selenium");
        hm.put(4, "Automation");
        hm.put(3, "testing");
        hm.put(5, "err");
        hm.put(0, "Old Value");
        hm.put(2, "Gaurav New Value");
        Set<Integer> all = hm.keySet();

        for (Integer i : all) {
            System.out.println("Key is : " + i + " Value is : " + hm.get(i));
        }
    }
}

// // Keys are ordered by their insertion order
//        Output
//        Key is : 2 Value is : Gaurav New Value
//        Key is : 1 Value is : A Selenium
//        Key is : 4 Value is : Automation
//        Key is : 3 Value is : testing
//        Key is : 5 Value is : err
//        Key is : 0 Value is : Old Value

