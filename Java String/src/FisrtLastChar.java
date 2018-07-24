//Ex 8
/*Given 2 strings, a and b, return a new string made of the first char of a and the last
char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its
missing char.
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
*/
public class FisrtLastChar {
	public static void main(String[] args) {
		String str = "hello";
		String str2 ="";
		
		if(str2.length()>=1){
		System.out.print( str.charAt(0));
		System.out.print(str2.charAt(str2.length()-1));
		}
		else{
			System.out.print( str.charAt(0)+"@");
		}
	}
}



