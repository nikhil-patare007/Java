package javademo.practice;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] arr = {12, 3, 4, 5, 67, 7};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
//                if (arr[j] < arr[i]) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Elements of array sorted in descending order: ");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }
}
