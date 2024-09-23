package Main.Java.String;

import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "teststring";
        System.out.println("Most frequent character: " + mostFrequentCharacter(input));
    }

    public static char mostFrequentCharacter(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        char maxChar = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            if (freqMap.get(c) > maxCount) {
                maxChar = c;
                maxCount = freqMap.get(c);
            }
        }

        return maxChar;
    }
}
