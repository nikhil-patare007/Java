/*Given two strings, append them together (known as "concatenation") and return the result.
   However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" 
   yields "abcat".  conCat("abc", "cat") → "abcat" 
   conCat("dog", "cat") → "dogcat" 
   conCat("abc", "") → "abc" 
*/
public class StringEx15 {
public static void main(String[] args) {
	String str1="dog";
	String str2="cat";
	System.out.println(conCat(str1,str2));
}
public static String conCat(String str1,String str2){
	return(str1.concat(str2));
}
}
