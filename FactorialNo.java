package javademo.practice;

public class FactorialNo {
    public static void main(String[] args) {

        int num = 5;
        int fact = 1;

        for (int i = 1; i <=5 ; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of "+ num + " is " + fact );

    }
}
