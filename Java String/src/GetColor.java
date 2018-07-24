//Ex 9
/*Given a string, if the string begins with "red" or "blue" return that color string,
otherwise return the empty string.
seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/
public class GetColor {
public static void main(String[] args) {
	String str="blueTimes";
	if (str.startsWith("red")){
		System.out.println("red");
	}
	if(str.startsWith("blue")){
		System.out.println("blue");
		
	}
	else{
		System.out.println("");
	}
}
}
