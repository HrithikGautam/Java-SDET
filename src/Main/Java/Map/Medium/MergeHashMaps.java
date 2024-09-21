/*7. **Write a program to merge two `HashMap`s. If a key exists in both maps, add the values together.**
   - Input: `map1 = {1=10, 2=20}, map2 = {1=5, 3=15}`
   - Output: `{1=15, 2=20, 3=15}`*/

package Main.Java.Map.Medium;

import java.util.HashMap;
import java.util.Map;

public class MergeHashMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 10);
        map1.put(2, 20);

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 5);
        map2.put(3, 15);

        // Merge two maps
        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));

        System.out.println(map1);
    }
}