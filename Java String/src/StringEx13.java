/*Given a string and an int n, return a string made of the first and last n chars from the string. 
  The string length will be at least n.  
nTwice("Hello", 2) → "Helo" nTwice("Chocolate", 3) → "Choate" nTwice("Chocolate", 1) → "Ce" 
 */
public class StringEx13 {
public static void main(String[] args) {
	String str1="Chocolate";
	int length=3;
	System.out.println(nTwice(str1,length));
}
public static String nTwice(String str1, int length){
	return(str1.substring(0,length)+str1.substring(str1.length()-length,str1.length()));
}
}
