package Main.Java.String;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("First Repeating Character: " + findFirstRepeatingChar(input));
    }

    public static char findFirstRepeatingChar(String str) {
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;
            }
            seen.add(ch);
        }
        return '\0'; // Return null character if no repeating character exists
    }
}