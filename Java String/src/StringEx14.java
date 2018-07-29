/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
  such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
  including 0. Note: use .equals() to compare 2 strings.  
hasBad("badxx") → true 
hasBad("xbadxx") → true 
hasBad("xxbadxx") → false 
 */
public class StringEx14 {
public static void main(String[] args) {
	String str1="xxbad";
	System.out.println(hasBad(str1));
}
public static boolean hasBad(String str1){
	if(str1.startsWith("bad")||str1.startsWith("xbad")){
		
		return true;	
	}
	else
		return false;
	}
}
