package javademo.practice;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {

    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch = ' ';
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    static void permutationOfString(String str, int start, int end) {
        if (start == end - 1) {
            System.out.print(str+ " ");
        } else {
            for (int i = 0; i < end; i++) {
                str = swapString(str, start, i);
                permutationOfString(str, start + 1, end);
                str = swapString(str, start, i);
            }
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        permutationOfString(str, 0, len);
    }
}
