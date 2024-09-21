/*1. 3. **Given an array of integers, find the frequency of each number using a `Map`.**
   - Input: `{1, 2, 2, 3, 1, 4, 1}`
   - Output: `{1=3, 2=2, 3=1, 4=1}``*/

package Main.Java.Map.Easy;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 1};
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

    }
}
