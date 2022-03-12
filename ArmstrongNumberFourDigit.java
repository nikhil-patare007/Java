package javademo.practice;

public class ArmstrongNumberFourDigit {
    public static void main(String[] args) {
        int number = 371;
        int remainder, result = 0;

        int num = number;

        for (num = number; num != 0; num /= 10) {
            remainder = num % 10;
            result = result + (remainder * remainder * remainder);
        }

        if (result == number)
            System.out.println(number + " is an Armstrong no");
        else
            System.out.println(number + " is not an Armstrong no");
    }

}
