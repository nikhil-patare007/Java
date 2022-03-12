package javademo.practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseTheArray {
    public static void main(String[] args) {
        String[] arr = {"nik", "pat", "hii", "hello"};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]+" ");
        }
        System.out.println("New Array");

        Collections.reverse(Arrays.asList(arr));
        Arrays.stream(arr).forEach(e-> System.out.println(e));
    }
}
