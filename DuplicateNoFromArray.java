package javademo.practice;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNoFromArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 2, 3, 5};
        Set<Integer> set= new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    set.add(arr[j]);
            }
        }

        System.out.println(set);
    }
}
