/*11. **Given a list of words, group the words that are anagrams of each other using a `Map`.**
    - Input: `["eat", "tea", "tan", "ate", "nat", "bat"]`
    - Output: `[[eat, tea, ate], [tan, nat], [bat]]`*/

package Main.Java.Map.Medium;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        System.out.println(new ArrayList<>(anagramMap.values()));
    }
}
