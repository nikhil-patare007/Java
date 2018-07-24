//Ex 7
/*Given a string of odd length, return the string length 3 from its middle, so "Candy"
yields "and". The string length will be at least 3.
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
 
public class MiddleThree {
public static void main(String[] args) {
	StringBuilder str=new StringBuilder("Solving");
	if(str.length()==3){
		System.out.println(str);
	}else{
	int center=str.length()/2;
	System.out.println(str.substring(center-1,center+2)); 
	}
	
	//StringBuilder str2 =str.delete(4,5 );
	//System.out.println(str2.delete(0,1 ));
}
}
