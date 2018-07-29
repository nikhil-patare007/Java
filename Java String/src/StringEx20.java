/*Given a string s check if it is palindrome or not. */
public class StringEx20 {
public static void main(String[] args) {
String str="radar";
System.out.println(isPalindrome(str));

}
public static boolean isPalindrome(String str) {
	  for (int i = 0; i < (str.length()/2); i++) {
	     if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
	         return false;
	     }
	  }
	   
		  return true;
	}
}
