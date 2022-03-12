package javademo.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringFromArray {
    public static void main(String[] args) {
        String arr[] = {"nik", "nik", "pat", "nikpat"};
        Set<String> set= new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    set.add(arr[j]);
            }
        }

        System.out.println(set);
    }
}
