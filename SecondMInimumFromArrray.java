package javademo.practice;

public class SecondMInimumFromArrray {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,56,34};

        int minimum = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<minimum){
                minimum = secondMin;
                secondMin = array[i];
            }
            else if(array[i]<secondMin) {
                secondMin = array[i];
            }
        }

        System.out.println("Second min is "+secondMin);
    }
}
