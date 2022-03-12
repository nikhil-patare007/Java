package String.practice;

public class InitialsUpperCase {
    public static void main(String[] args) {
        String input ="I stay in pune";

        String[] words = input.split("\\s"); //split string by each space and make words

        String str = " ";
        for (String s : words) {
            String word = s;
            if (Character.isUpperCase(word.charAt(0))) {
                word = String.valueOf(word.charAt(0)).toLowerCase() + word.substring(1);
            } else {
                word = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
            }
            str = str.concat(word).concat(" ");
        }
        System.out.print(str.trim()); // i Stay In Pune
    }
}
