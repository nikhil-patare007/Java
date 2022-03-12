package javademo.practice;

public class PrimeSplit {
    public static void main(String[] args) {
        int n = 22;
        boolean flag = false;

        for (int i = 2; i <= n/2; ++i) {
            if (checkPrime(i)) {
               if (checkPrime(n - i)) {
                    int d = n -i;
                    System.out.println("Number "+n+" can be expressed as the sum of" + " " + i + " "+d);
                    flag = true;
                }
            }
        }
        if (!flag)
            System.out.println(n + "cannot be expressed as the sum of two prime numbers.");
    }

    static boolean checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num/2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
