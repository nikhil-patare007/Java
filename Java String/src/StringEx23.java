/*Anagram*/  
public class StringEx23 {
public static void main(String[] args) {
	String strng1="keep";
	String strng2="peek";
	System.out.println(isAnagram(strng1,strng2));
}

private static boolean isAnagram(String strng1,String strng2){
	char[] str1 = strng1.toCharArray();
	char[] str2 = strng2.toCharArray();
	if (str1.length!= str2.length)
        return false;
    int[] counts = new int[26]; 
    for (int i = 0; i < str1.length; i++){
        counts[str1[i]-97]++;  
        counts[str2[i]-97]--;   
    }
    for (int i = 0; i<26; i++)
        if (counts[i] != 0){
            return false;
            }
    return true;	
}
}
