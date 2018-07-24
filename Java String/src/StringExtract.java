//Ex 5
/*Given an "out" string length 4, such as "<<>>", and a word, return a new string where
 the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i,j)
  to extract the String starting at index i and going up to but not including index j.
Input output
<<>>   Yay   <<Yay>>
*/

public class StringExtract {
public static void main(String[] args) {
	String str="yay";
	String str1="WooHoo";
	System.out.println("<<"+str.substring(0, 3)+">>");
	System.out.println("<<"+str1.substring(0, 6)+">>");
}
}
