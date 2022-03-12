package javademo.practice;

public class PalindromeNo {
    public static void main(String[] args) {
        int num = 1221;
        int x = 0, sum =0;
        int temp = num;
        while (num > 0) {
            x = num % 10;
            num = num / 10;
            sum = sum * 10 + x;
        }
        if (temp == sum)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}
