//Ex 10
/*Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
The string may be any length. If there are fewer than 2 chars, use whatever is there.
sextraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
*/
 public class Copy {
public static void main(String[] args) {
	String str="a";
	if(str.length()<2){
		System.out.println(str + str + str);
	}
	else{
		 str = str.substring(0,2);
    		System.out.println(str+str+str);
	}
}
}
