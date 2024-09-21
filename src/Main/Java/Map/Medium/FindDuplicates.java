/*8. **Write a Java program to find duplicate elements in an array using a `Map`.**
   - Input: `{1, 2, 2, 3, 4, 5, 5, 6}`
   - Output: `Duplicate elements: [2, 5]`*/

package Main.Java.Map.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
