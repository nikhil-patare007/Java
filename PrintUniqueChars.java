package String.practice;

import java.util.HashSet;
import java.util.stream.Collectors;

public class PrintUniqueChars {
    public static void main(String[] args) {
        String input = "nikhilPatare";

        HashSet<Character> set = new HashSet<>();
        String uniqueChars = " ";

        for (int i = 0; i < input.length(); i++) {
            if(!set.contains(input.charAt(i))) {
                uniqueChars = uniqueChars + input.charAt(i);
                set.add(input.charAt(i));
            }
        }
        System.out.println(uniqueChars.trim());

        System.out.println(input.chars().distinct().mapToObj(e->String.valueOf((char)e)).collect(Collectors.joining()));
    }
}
