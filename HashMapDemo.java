package javademo.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();

        map1.put("One", 1);
        map1.put("Two", 2);
        map1.put("Three", 3);

        Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();

        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }


        HashMap<Integer, String> map2 = new HashMap<>();

        //retrieve all keys present in a HashMap

        map2.put(1, "AAA");

        map2.put(2, "BBB");

        map2.put(3, "CCC");

        Set<Integer> keySet = map2.keySet();
        keySet.forEach(k-> System.out.println(k));

        Collection<String> values =map2.values();
        values.forEach(v-> System.out.println(v));

    }
}
