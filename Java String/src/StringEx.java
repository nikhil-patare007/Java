//practice
public class StringEx {
	public static void main(String[] args) {
		String str1 = "Nikhil";
		String str2= new String("Niks");
		str1 = str1.concat("Patare");
           System.out.println(str1);
		
		str2.concat("Patare");//not printing(immutable)
		str2=str2.concat("Patare");//re-assigning 
		System.out.println(str2);
	}

}
