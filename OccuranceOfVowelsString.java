package javademo.practice;

import java.util.*;

public class OccuranceOfVowelsString {
    public static void main(String[] args) {
        String str1 = "Occurrence Of Vowels String u";
        String str = str1.toLowerCase();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        HashMap<Character, Integer> vowelCount =  new HashMap<>();
        char[] strArray = str.replaceAll(" ", "").toCharArray();
        for(char c : strArray) {
                if(vowelCount.containsKey(c)){
                        vowelCount.put(c, vowelCount.get(c)+1);
                }
                else if(vowels.contains(c)){
                    vowelCount.put(c, 1);
                }
        }
        System.out.println(vowelCount);

        Set<Map.Entry<Character, Integer>> entrySet = vowelCount.entrySet();
        Set<Character> keySet = vowelCount.keySet();
        Collection<Integer> valueSet = vowelCount.values();


        int maxCount = 0;
        char maxChar = 0;
        for(Map.Entry<Character, Integer> entry : entrySet) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Max occurred vowel "+maxChar+" : "+maxCount);

        for (int i = 0; i < 5; i++) {
            for (int j = (5-i); j >1  ; j--) {
                System.out.print(" ");
            }
            for (int j =0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
