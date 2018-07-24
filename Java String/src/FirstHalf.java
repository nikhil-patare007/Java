
//Ex 2
/*Given a string of even length, return the first half. So the string "WooHoo" yields
"Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
Here parameter to function is input , and result is output
*/
import java.util.Scanner;
public class FirstHalf {
	    public static void main(String[] args) {
             String str;
	        System.out.println("Enter the name:");
	        Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
	        int x = str.length()/2;
	        System.out.println(str.substring(0, x));

	    }
	}


