
/*Given a binary string, count number of substrings that start and end with 1. For example,
 *  if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”. 
 */
public class StringEx21 {
public static void main(String[] args) {
  String string="00100101";
  StringEx21 c1= new StringEx21();
  char str[] = string.toCharArray();
  int n = str.length;
  System.out.println(c1.countSubStr(str,n));
}
	 public static int countSubStr(char str[],int n) 
	    {
	        int count = 0;  
	       for (int i = 0; i<n; i++)  {
	            if (str[i] == '1') {
	               for (int j = i + 1; j< n; j++) 
	                {
	                    if (str[j] == '1')
	                        count++;
	                }
	            }
	        }
	        return count;
	}
}


