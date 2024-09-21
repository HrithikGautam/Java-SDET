/*5. **Write a Java program to sort a `HashMap` by values.**
   - Input: `{3=Zebra, 1=Apple, 2=Orange}`
   - Output: `{1=Apple, 2=Orange, 3=Zebra}`*/

package Main.Java.Map.Easy;

import java.util.*;

public class SortByValues {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Zebra");
        map.put(1, "Apple");
        map.put(2, "Orange");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);
    }
}
