/*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
 *  Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".  
makeTags("i", "Yay") → "<i>Yay</i>"
 makeTags("i", "Hello") → "<i>Hello</i>" 
 makeTags("cite", "Yay") → "<cite>Yay</cite>"*/ 

public class StringEx17 {
public static void main(String[] args) {
	String str1="i";
	String str2="Yay";
	System.out.println(makeTags(str1,str2));
}
public static String makeTags(String str1, String str2){
	return('<' + str1+ '>' + str2 + "</" +str1+ '>');
}


}
