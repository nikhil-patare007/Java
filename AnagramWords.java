package javademo.practice;

import org.apache.poi.sl.draw.Drawable;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class AnagramWords {
    public static void main(String[] args) {
        String a = "motherinlaw";
        String b = "hitlerwoman";
        if(isAnagram(a,b)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not");
        }
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        HashMap<Character, Integer> mapCount = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if(mapCount.containsKey(a.charAt(i))){
                mapCount.put(a.charAt(i), mapCount.get(a.charAt(i))+1);
            }else {
                mapCount.put(a.charAt(i), 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if(mapCount.containsKey(b.charAt(i))){
                    mapCount.put(b.charAt(i), mapCount.get(b.charAt(i)) -1);
            }
        }

        Set<Character> keys = mapCount.keySet();

        for(char key: keys) {
            if(mapCount.get(key) != 0){
                return false;
            }
        }
        return true;

    }


}
