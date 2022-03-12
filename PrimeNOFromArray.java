package javademo.practice;

public class PrimeNOFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 54, 6, 76, 7};
        int i = 0;
        boolean flag = true;
        System.out.println("Prime nos are");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                continue;
            else {
                for (int j = 2; j < arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(arr[i]);
            }
        }
    }
}

