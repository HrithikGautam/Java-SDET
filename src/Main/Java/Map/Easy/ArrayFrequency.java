/*6. **Given two arrays, use a `Map` to count how many numbers from the second array appear in the first array.**
   - Array1: `{1, 3, 4, 5, 7}`
   - Array2: `{3, 5, 9, 3}`
   - Output: `{3=2, 5=1}`*/

package Main.Java.Map.Easy;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 7};
        int[] array2 = {3, 5, 9, 3};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array2) {
            if (isPresentInArray(array1, num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        System.out.println(map);
    }

    private static boolean isPresentInArray(int[] array, int num) {
        for (int n : array) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}