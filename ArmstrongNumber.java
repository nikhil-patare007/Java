package javademo.practice;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 371;
        int initialNo, remainder, result = 0;

        initialNo = num;

        while (initialNo != 0) {
            remainder = initialNo % 10;
            result += Math.pow(remainder, 3);
            initialNo /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong no" );
        else
            System.out.println(num + " is not an Armstrong no" );
    }
}
