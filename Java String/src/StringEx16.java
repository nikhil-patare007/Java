/*
 Given a string, return true if the first 2 chars in the string also appear at the end of the string,
 such as with "edited".  
frontAgain("edited") → true 
frontAgain("edit") → false
 frontAgain("ed") → true
 */
public class StringEx16 {
public static void main(String[] args) {
	String str1="edited";
	System.out.println(frontAgain(str1));
}
public static boolean frontAgain(String str1){
	if(str1.charAt(0)==str1.charAt(str1.length()-2) && str1.charAt(1)==str1.charAt(str1.length()-1)){
		return true;
	}else{
		return false;
	}
}

}
