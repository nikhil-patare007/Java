package String.practice;

public class LowerToUpper {
    public static void main(String[] args) {
        String input = "NiKhiL PaTaRe";
        String modified = " ";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                modified = modified.concat(String.valueOf(input.charAt(i)).toLowerCase());
            } else {
                modified = modified.concat(String.valueOf(input.charAt(i)).toUpperCase());
            }
        }
        System.out.println(modified); // nIkHIl pAtArE
    }

}
