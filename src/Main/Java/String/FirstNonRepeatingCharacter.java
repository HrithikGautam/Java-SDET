package Main.Java.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("First Non-Repeating Character: " + findFirstNonRepeatingChar(input));
    }

    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';  // Return null character if no unique character exists
    }
}