/* Given a string, return a "rotated left 2" version where the first 2 chars are moved to
the end. The string length will be at least 2.
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
*/
public class StringEx12 {
public static void main(String[] args) {
	String str1="java";
	
	System.out.println(left2(str1));
}
public static String left2(String str1){
     
	return str1.substring(2, str1.length()) + str1.substring(0,2);
      }
	
}
