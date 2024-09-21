/*4. **Write a Java program to sort a `HashMap` by keys.**
   - Input: `{3=Zebra, 1=Apple, 2=Orange}`
   - Output: `{1=Apple, 2=Orange, 3=Zebra}`*/


package Main.Java.Map.Easy;

import java.util.Map;
import java.util.TreeMap;

public class SortByKeys {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Zebra");
        map.put(1, "Apple");
        map.put(2, "Orange");

        System.out.println(map); // TreeMap automatically sorts by keys
    }
}