package javademo.practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "nikhil";
        String reverse = " ";
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);

//        Other way
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
