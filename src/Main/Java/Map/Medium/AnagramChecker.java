/*9. **Write a program that checks if two strings are anagrams of each other using a `Map`.**
   - Input: `"listen", "silent"`
   - Output: `true`*/

package Main.Java.Map.Medium;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(areAnagrams(str1, str2));
    }

    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }
}