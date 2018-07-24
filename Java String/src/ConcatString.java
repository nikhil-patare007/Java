//Ex 3
/*Given 2 strings, return their concatenation, except omit the first char of each. The
strings will be at least length 1.
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/

public class ConcatString {
public static void main(String[] args) {
	String str=new String("hello");
	String str1=new String("there");
	System.out.println(str.substring(1)+str1.substring(1));
}
}

