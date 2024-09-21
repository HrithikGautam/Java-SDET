/*12. **Write a Java program to create a `LinkedHashMap` that preserves the insertion order and removes the oldest entry when a certain capacity is reached (LRU cache simulation).**
    - Input: Operations that exceed the capacity of the map.
    - Output: The `LinkedHashMap` with only the most recent elements within the capacity.*/

package Main.Java.Map.Hard;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");
        System.out.println(cache); // {1=one, 2=two, 3=three}

        cache.put(4, "four");  // Exceeds capacity, removes the eldest entry (1=one)
        System.out.println(cache); // {2=two, 3=three, 4=four}

        cache.get(2); // Access key 2
        cache.put(5, "five"); // Removes the eldest entry which is now (3=three)
        System.out.println(cache); // {2=two, 4=four, 5=five}
    }
}
