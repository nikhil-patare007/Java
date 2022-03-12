package javademo.practice;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int a = 1, b = 1;
        int count = 0;
        int num = 50;
        while (count <= num) {
            count = a + b;
            if (count >= num)
                break;
            System.out.println(count + " ");
            a = b;
            b = count;
        }
    }

}

