package javademo.practice;

import java.util.*;
import java.util.stream.Stream;

public class HashmapKeysValuesSort {
    public static void main(String[] args) {

        //Sort using keys use treemap
        Map<String, Integer> sortedMapKey = new TreeMap<>();
        sortedMapKey.put("John", 21);
        sortedMapKey.put("Maria", 34);
        sortedMapKey.put("Mark", 31);
        sortedMapKey.put("Sydney", 24);

        System.out.println(sortedMapKey);

        Map<String, Integer> sortedMapValue = new HashMap<>();
        sortedMapValue.put("John", 21);
        sortedMapValue.put("Maria", 34);
        sortedMapValue.put("Mark", 31);
        sortedMapValue.put("Sydney", 24);

        Stream<Map.Entry<String, Integer>> sorted =
                sortedMapValue.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        sorted.forEach(e-> System.out.println(e));

    }

}
