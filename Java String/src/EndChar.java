//Ex 4
/*Given a string, return a string length 1 from its front, unless front is false, in which case
return a string length 1 from its back. The string will be non­empty.
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
*/
public class EndChar {
public static void main(String[] args) {
String str="hello";
boolean b= false;
EndChar e=new EndChar();

System.out.println(e.theEnd(str, b));

}

public String theEnd(String str, boolean b){
	if(b){
		
		return(str.substring(0,1));
	}
	else{
		return str.substring(str.length()-1);
	}
}
}
