package javademo.practice;

public class CountOfCharsString {

    public static void main(String[] args) {
        String str = "nikhil patare";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count ++;
            }
        }

        String str2 = str.trim();
        System.out.println(str2.split("\\s+").length);

        System.out.println("Count of character in string " + str + " is " +count);

    }
}

