package javademo.practice;

public class PrimeNo {
    public static void main(String[] args) {
        int num = 7;
        boolean flag = false;
        for (int i = 2; i <= num / 2 + 1; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("No is prime");
        else
            System.out.println("Not prime");

    }
}
