package Main.Java.String;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        String input = "programming";
        char charToRemove = 'g';
        System.out.println(removeCharacter(input, charToRemove));
    }

    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }
}