/*15. Use ConcurrentHashMap to handle concurrent updates in a multi-threaded environment.
Problem:
Simulate a scenario where multiple threads update a ConcurrentHashMap concurrently.*/

package Main.Java.Map.Hard;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Thread 1 adds values to the map
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentMap.put("Thread1-Key" + i, i * 10);
            }
        });

        // Thread 2 adds values to the map
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentMap.put("Thread2-Key" + i, i * 100);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Printing the map after both threads finish
        concurrentMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}