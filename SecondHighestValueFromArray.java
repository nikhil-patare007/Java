package javademo.practice;

import java.util.Arrays;


public class SecondHighestValueFromArray {
    public static void main(String[] args) {
        int[] arr2 = {10, 11, 15, 8};
        Arrays.sort(arr2);
        System.out.println(arr2[arr2.length - 2]);

        int len = arr2.length;
        int highestValue = Integer.MIN_VALUE;
        int secondHighestValue = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if(arr2[i]>highestValue) {
                secondHighestValue = highestValue;
                highestValue = arr2[i];
            }

            if(arr2[i]<highestValue && arr2[i] >secondHighestValue) {
                secondHighestValue = arr2[i];
            }
        }

        System.out.println("secondHighestValue " + secondHighestValue);

    }

}



