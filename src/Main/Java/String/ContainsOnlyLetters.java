package Main.Java.String;

public class ContainsOnlyLetters {
    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println("Contains only letters: " + containsOnlyLetters(input));
    }

    public static boolean containsOnlyLetters(String str) {
        return str.matches("[a-zA-Z]+");
    }
}
