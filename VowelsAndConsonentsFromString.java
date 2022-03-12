package javademo.practice;

import java.util.Arrays;
import java.util.List;

public class VowelsAndConsonentsFromString {
    public static void main(String[] args) {
        String str1 = "Java Program to Compute all the permutations of the string";
        String str = str1.toLowerCase();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        char[] charArray = str.toCharArray();
        int countOfVowels = 0;
        int countOfConsonents = 0;
        for(char c :charArray)
        {
            if(vowels.contains(c)){
                countOfVowels++;
            }
            else if(c>='a' && c<='z'){
                countOfConsonents++;
            }
        }
        System.out.println("Count of vowels: " +countOfVowels);
        System.out.println("Count of consonants: "+countOfConsonents);
    }
}
