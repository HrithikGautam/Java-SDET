/*	Create a program that counts the occurrences of each character in a given string.
        •	Input: "programming"
        •	Output: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
        */
package Main.Java.Map.Easy;

import java.util.*;
import java.util.Map;

public class CharacterOccurences {


    public static void main(String[] args) {

        String input = "programming";
        char[] charArray = input.toCharArray();
        countCharacterOccurrences(charArray);
    }

    public static void countCharacterOccurrences(char[] charArray) {

        // Initialize an empty HashMap to store character occurrences
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the array
        for (char c : charArray) {

            // If the character is already in the HashMap, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            // If the character is not in the HashMap, add it with a count of 1
            else {
                charCountMap.put(c, 1);
            }
        }

        // Print the character occurrences
        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}