package Main.Java.String;

public class StringRotationCheck {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        System.out.println("Are rotations: " + areRotations(str1, str2));
    }

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String combined = s1 + s1; // Combine string with itself
        return combined.contains(s2);
    }
}
