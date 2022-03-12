package javademo.practice;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "Nikhil Patare";
        String[] words = str.split("\\s");
        StringBuilder reverseWord = new StringBuilder(" ");

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord.append(sb.toString()).append(" ");
        }

        System.out.println(reverseWord.toString().trim());

        for (String word : words) {
            String reverseWord1 = " ";
            for (int i = word.length()-1; i >=0 ; i--) {
                reverseWord1=  reverseWord1 + word.charAt(i);
            }
            System.out.print(reverseWord1.trim()+ " ");
        }

    }
}
