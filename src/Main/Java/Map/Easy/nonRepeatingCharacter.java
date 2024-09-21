/*2. **Write a Java program to find the first non-repeating character in a string using a `Map`.**
   - Input: `"swiss"`
   - Output: `w`*/

package Main.Java.Map.Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> freqMap = new LinkedHashMap<>();  // LinkedHashMap maintains insertion order

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}
