package javademo.practice;

import java.util.ArrayList;
import java.util.List;

public class NearestSmallestNo {
    static void printPrevSmaller(int []arr, int n)
    {
        List<Integer> listOfInteger = new ArrayList<>();
        int tmp = 0;
        //{10,50, -9, 67, 100};
        //op [-1,10,-1,-9,-9]
        listOfInteger.add(-1); // -1 , 10
        // Start from second element
        for (int i = 1; i < n; i++)
        {
            tmp= arr[i];
            for( int j = i - 1; j >= 0; j--) {
                if (arr[j] <= tmp) { //10< -9
                    tmp=arr[j];
                }
            }
            if(arr[i]!=tmp){ //-9 != -9
                listOfInteger.add(tmp);
            }
            else  {
                listOfInteger.add(-1);
            }
        }
        listOfInteger.forEach(e-> System.out.print(e+" "));
    }

    public static void main(String[] args) {
        int []arr =  {10, 50, -9, 67, 100};
        int n = arr.length;
        printPrevSmaller(arr, n);
        //op [-1,10,-1,-9,-9]
    }
}
