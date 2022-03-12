package javademo.practice;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfCharsHashmap {
    public static void main(String[] args) {
        String input = "PROGRESSION";
        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = input.replaceAll("\\s", "").toCharArray(); // char [] charArr = {'P', 'R', 'O'}

        for(char c : charArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);    //{P=1, R=2}
            }
            else {
                charCountMap.put(c,1);
            }
        }
        System.out.println(charCountMap);


        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        int maxCount = 0;
        char maxChar = 0;

        for(Map.Entry<Character, Integer> entry :  entrySet) {
            if(entry.getValue()>maxCount) {
                maxCount = entry.getValue();
                maxChar =  entry.getKey();
            }
        }
        System.out.println("Maximum Occurring char and its count :"+maxChar+" : "+maxCount);

    }
}
